package org.ex.repository;

import org.ex.entity.UserLoginClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginInterface extends JpaRepository<UserLoginClass,Long> {
    UserLoginClass findByUsername(String username);
}
