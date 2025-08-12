package org.ex.service;

import org.ex.entity.UserLoginClass;

public interface UserService {
    UserLoginClass register(UserLoginClass user);
    boolean login(String username, String password);
}

