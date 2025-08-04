package org.example.repository;

import org.example.model.Friend;

import java.util.List;

public interface FriendRepository {
    boolean addFriend(Friend friend);
    List<Friend> getAllFriends();
    boolean updateFriend(String id, String fieldName, String newValue);

    boolean deleteFriend(String id);

}
