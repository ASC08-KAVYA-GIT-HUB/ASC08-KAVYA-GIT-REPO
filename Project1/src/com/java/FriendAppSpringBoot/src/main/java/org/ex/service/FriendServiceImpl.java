package org.ex.service;

import org.ex.entity.Friend;
import org.ex.repository.FriendRepositorySpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendServiceImpl implements  FriendServiceSpring{
    @Autowired
    private FriendRepositorySpring friendReositorySpring;

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

    @Override
    public boolean login(String userName, String password) {
     Friend friend= friendReositorySpring.findByUserNameAndPassword(userName,password);
     return friend!=null;
    }

    @Override
    public void signUp(Friend friend) {
        friendReositorySpring.save(friend);
    }
}
