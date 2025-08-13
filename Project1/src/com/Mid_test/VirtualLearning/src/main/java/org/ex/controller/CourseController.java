package org.ex.controller;

import java.util.List;
import org.ex.entity.Course;
import org.ex.service.CourseService;
import org.ex.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
   private final CourseService courseService;
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }


    // Delete course
    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return "Course deleted successfully!";
    }

    // Get course by ID
    @GetMapping("/get/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }

    // Get all courses
    @GetMapping("/all")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    // Search by author
    @GetMapping("/search/author")
    public List<Course> searchByAuthor(@RequestBody String authorName) {
        return courseService.searchByAuthor(authorName);
    }

    @GetMapping("/search/name")
    public List<Course> searchByName(@RequestBody String courseName) {
        return courseService.searchByName(courseName);
    }

}


