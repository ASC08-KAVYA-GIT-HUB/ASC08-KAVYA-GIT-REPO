package org.ex.repository;

import org.ex.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository <Course,Long> {
    List<Course> findByAuthorName(String authorName);
    List<Course> findByCourseName(String courseName);
}
