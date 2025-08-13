package org.ex.service;

import org.ex.entity.Course;

import java.util.List;

public interface CartService {
    void addToCart(Course course);

    boolean removeFromCart(Long courseId);

    List<Course> viewCart();
}
