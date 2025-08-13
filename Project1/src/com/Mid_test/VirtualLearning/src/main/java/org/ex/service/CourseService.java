package org.ex.service;

import org.ex.entity.Course;

import java.util.List;

public interface CourseService {
    Course addCourse(Course course);
    void deleteCourse(Long id);
    Course getCourseById(Long id);
    List<Course> getAllCourses();
    List<Course> searchByAuthor(String authorName);
    List<Course> searchByName(String courseName);
}
