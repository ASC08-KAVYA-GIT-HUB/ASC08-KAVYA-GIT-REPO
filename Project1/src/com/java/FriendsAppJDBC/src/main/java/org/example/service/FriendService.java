package org.example.service;
import org.example.model.Friend;
import java.util.List;

public interface FriendService {

        boolean addFriend(Friend friend);
        List<Friend> getAllFriends();
        boolean updateFriend(String id, String fieldName, String newValue);
        boolean deleteFriend(String id);
}
