package org.example.service;
import org.example.model.Friend;
import org.example.repository.FriendRepository;
import org.example.repository.FriendRepositoryImpl;
import java.util.List;

public class FriendServiceImpl implements FriendService{
       FriendRepository friendRepo = new FriendRepositoryImpl();

    @Override

    public boolean addFriend(Friend friend) {
            return friendRepo.addFriend(friend);
        }

        @Override
        public List<Friend> getAllFriends() {
            return friendRepo.getAllFriends();
        }

        @Override
        public boolean updateFriend(Friend friend) {
            return friendRepo.updateFriend(friend);
        }

        @Override
        public boolean deleteFriend(String id) {
            return friendRepo.deleteFriend(id);
        }
    }


