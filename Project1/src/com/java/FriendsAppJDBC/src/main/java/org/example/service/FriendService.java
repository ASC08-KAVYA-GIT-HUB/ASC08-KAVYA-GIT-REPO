package org.example.service;
import org.example.model.Friend;
import java.util.List;

public interface FriendService {

        boolean addFriend(Friend friend);
        List<Friend> getAllFriends();
        boolean updateFriend(Friend friend);
        boolean deleteFriend(String id);
}
