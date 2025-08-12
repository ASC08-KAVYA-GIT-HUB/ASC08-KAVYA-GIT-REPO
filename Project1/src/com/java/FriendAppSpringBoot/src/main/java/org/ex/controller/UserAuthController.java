package org.ex.controller;

import org.ex.entity.Friend;
import org.ex.entity.UserLoginClass;
import org.ex.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class UserAuthController {
    private final UserService userService;

    public UserAuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public UserLoginClass register(@RequestBody UserLoginClass user) {
        return userService.register(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody UserLoginClass loginRequest) {
        boolean isLoggedIn = userService.login(
                loginRequest.getUsername(),
                loginRequest.getPassword()
        );

        return isLoggedIn ? "Login successful!" : "Invalid username or password!";
    }
}
