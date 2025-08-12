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
    // Update
    @PutMapping("/{id}")
    public Friend updateFriend(@PathVariable Long id, @RequestBody Friend friend) {
        return friendService.updateFriend(id, friend);
    }

        @DeleteMapping("/{id}")
        public String deleteFriend(@PathVariable Long id) {
            friendService.deleteById(id);
            return "Friend deleted successfully";
        }


    }





