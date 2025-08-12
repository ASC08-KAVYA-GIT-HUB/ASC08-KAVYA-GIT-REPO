package org.ex.service;

import org.ex.entity.UserLoginClass;
import org.ex.repository.UserLoginInterface;
import org.springframework.stereotype.Service;
@Service

    public class UserServiceImpl implements UserService{
        private final UserLoginInterface userRepo;

        public UserServiceImpl(UserLoginInterface userRepo) {
            this.userRepo = userRepo;
        }

        @Override
        public UserLoginClass register(UserLoginClass user) {
            return userRepo.save(user);
        }

        @Override
        public boolean login(String username, String password) {
            UserLoginClass user = userRepo.findByUsername(username);
            return user != null && user.getPassword().equals(password);
        }
    }

