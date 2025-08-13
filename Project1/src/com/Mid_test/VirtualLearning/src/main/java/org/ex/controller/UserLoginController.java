package org.ex.controller;

import org.ex.entity.UserLogin;
import org.ex.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserLoginController {
    @Autowired
   private UserLoginService userLoginService;

    public UserLoginController(UserLoginService userLoginService) {
        this.userLoginService =userLoginService;
    }

    // Register a new user
    @PostMapping("/register")
    public UserLogin register(@RequestBody UserLogin login) {
        return userLoginService.register(login);
    }

    // Login user
    @PostMapping("/login")
    public String login(@RequestBody UserLogin loginRequest) {
        boolean success = userLoginService.login(loginRequest.getLoginId(), loginRequest.getPassword());
        return success ? "Login successful!" : "Invalid login credentials!";
    }
}

