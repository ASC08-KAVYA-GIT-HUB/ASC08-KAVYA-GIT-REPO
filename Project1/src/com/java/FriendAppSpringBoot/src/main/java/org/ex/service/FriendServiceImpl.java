package org.ex.service;

import org.ex.entity.Friend;
import org.ex.repository.FriendRepositorySpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Service
public class FriendServiceImpl implements  FriendServiceSpring {
    @Autowired
    private FriendRepositorySpring friendReository;

    public FriendServiceImpl(FriendRepositorySpring friendRepository) {
        this.friendReository = friendRepository;
    }

    public Friend saveFriend(Friend friend) {
        // Save into FRIENDS table
        return friendReository.save(friend);


    }

    @Override
    public List<Friend> getAllFriends() {
        return friendReository.findAll();
    }

    public Friend getFriendById(Long Id) {
        return friendReository.findById(Id).orElse(null);
    }
    @Override
    public void deleteById(Long Id) {
        friendReository.deleteById(Id);
    }

    @Override
    public Friend updateFriend(Long id, Friend friend) {
        return friendReository.findById(id)
                .map(existingFriend -> {
                    existingFriend.setName(friend.getName());
                    existingFriend.setEmail(friend.getEmail());
                    existingFriend.setPhone(friend.getPhone());
                    return friendReository.save(existingFriend);
                })
                .orElseThrow(() -> new RuntimeException("Friend not found"));
    }

}

