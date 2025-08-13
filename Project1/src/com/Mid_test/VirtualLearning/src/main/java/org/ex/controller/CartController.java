package org.ex.controller;

import org.ex.entity.Course;
import org.ex.service.CartService;
import org.ex.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
@Autowired
        private final CartService cartService;
        private final CourseService courseService;

        public CartController(CartService cartService, CourseService courseService)
        {
            this.cartService = cartService;
            this.courseService = courseService;
        }

        @PostMapping("/add/{courseId}")
        public String addToCart(@PathVariable Long courseId) {
            Course course = courseService.getCourseById(courseId);
            if (course != null) {
                cartService.addToCart(course);
                return "Course added to cart.";
            }
            return "Course not found.";
        }

        @DeleteMapping("/remove/{courseId}")
        public String removeFromCart(@PathVariable Long courseId) {
            boolean removed = cartService.removeFromCart(courseId);
            return removed ? "Course removed from cart." : "Course not in cart.";
        }

        @GetMapping("/view")
        public List<Course> viewCart() {
            return cartService.viewCart();
        }
    }


