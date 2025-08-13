package org.ex.service;

import org.ex.entity.UserLogin;

public interface UserLoginService {
    UserLogin register(UserLogin login);
    boolean login(String loginId, String password);
}
