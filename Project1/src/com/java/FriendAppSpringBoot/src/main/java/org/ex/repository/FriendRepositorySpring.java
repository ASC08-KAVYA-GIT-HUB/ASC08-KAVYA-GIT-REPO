package org.ex.repository;

import org.ex.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepositorySpring extends JpaRepository<Friend,Long> {

}
