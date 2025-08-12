package org.ex.controller;

import org.ex.model.FriendModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/friendModel")
public class FriendControllerUsingModel {
    @GetMapping("/getFriends")
    public List<FriendModel> getFriendsAsList() {

        List<FriendModel> employees = new java.util.ArrayList<>();
        employees.add(new FriendModel(1, "Alice"));
        employees.add(new FriendModel(2, "Bob"));
        employees.add(new FriendModel(3, "Charlie"));
        return employees;
    }
}

