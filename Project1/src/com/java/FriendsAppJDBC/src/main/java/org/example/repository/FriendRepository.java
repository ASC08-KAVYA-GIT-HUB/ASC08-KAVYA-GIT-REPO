package org.example.repository;

import org.example.model.Friend;

import java.util.List;

public interface FriendRepository {
    boolean addFriend(Friend friend);
    List<Friend> getAllFriends();
    boolean updateFriend(Friend friend);
    boolean deleteFriend(String id);

}
