package org.ex.repository;

import org.ex.entity.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<UserLogin,Long> {
   UserLogin findByLoginId(String loginId);
}
