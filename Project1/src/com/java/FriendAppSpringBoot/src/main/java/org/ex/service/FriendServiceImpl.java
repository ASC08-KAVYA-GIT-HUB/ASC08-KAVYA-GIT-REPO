package org.ex.service;

import org.ex.entity.Friend;
import org.ex.repository.FriendReositorySpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class FriendServiceImpl implements  FriendServiceSpring{
    @Autowired
    private FriendReositorySpring friendReositorySpring;

    @Override
    public Friend saveFriend(Friend friend) {
        return  friendReositorySpring.save(friend);
    }

    @Override
    public List<Friend> getAllFriends() {
        return friendReositorySpring.findAll();
    }

    @Override
    public Friend getFriendById(Long Id) {
        return friendReositorySpring.findById(Id).orElse(null);
    }

    @Override
    public void deleteById(Long Id) {
        friendReositorySpring.deleteById(Id);

    }
}
