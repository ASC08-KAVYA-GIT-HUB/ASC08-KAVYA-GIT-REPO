package org.ex.service;

import org.ex.entity.Friend;

import java.util.List;

public interface FriendServiceSpring {
    Friend saveFriend(Friend friend);
    List<Friend> getAllFriends();
    Friend getFriendById(Long Id);
    void deleteById(Long Id);
    Friend updateFriend(Long id, Friend friend);


}
