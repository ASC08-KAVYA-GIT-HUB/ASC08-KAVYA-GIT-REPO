package org.ex.service;

import org.ex.entity.Course;
import org.ex.exceptioncustoms.CourseNotFoundException;
import org.ex.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        if (!courseRepository.existsById(id)) {
            throw new RuntimeException("Course not found with ID: " + id);
        }
        courseRepository.deleteById(id);
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id) .orElseThrow(() -> new CourseNotFoundException("Course with ID " + id + " not found"));
    }



    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public List<Course> searchByAuthor(String authorName) {
        return courseRepository.findByAuthorName(authorName);
    }

    @Override
    public List<Course> searchByName(String courseName) {
        return courseRepository.findByCourseName(courseName);
    }
}
