package org.ex.controller;

import org.ex.entity.Friend;
import org.ex.service.FriendServiceSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/friends")
public class FriendController {

        @Autowired
        private FriendServiceSpring friendService;

       @PostMapping("/create")
        public Friend createFriend(@RequestBody Friend friend) {

           return friendService.saveFriend(friend);
        }

        @GetMapping("/all")
        public List<Friend> getAllFriends() {
            return friendService.getAllFriends();
        }

        @GetMapping("/{id}")
        public Friend getFriend(@PathVariable Long id) {

           return friendService.getFriendById(id);
        }

        @DeleteMapping("/{id}")
        public String deleteFriend(@PathVariable Long id) {
            friendService.deleteById(id);
            return "Friend deleted successfully";
        }
    @PostMapping("/login")
    public String login(@RequestBody Friend loginRequest) {
        boolean isLoggedIn = friendService.login(loginRequest.getUserName(), loginRequest.getPassword());
        if (isLoggedIn) {
            return "Login successful!";
        }
        return "Invalid username or password!";
    }
    @PostMapping("/signup")
    public void signup(@RequestBody Friend friend)
    {
        friendService.signUp(friend);
        System.out.println("sign up successfull");
    }
    }





