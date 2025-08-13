package org.ex.service;

import org.ex.entity.UserLogin;
import org.ex.exceptioncustoms.InvalidPasswordException;
import org.ex.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginImpl implements UserLoginService{
    @Autowired
    private final LoginRepository loginRepository;

    public UserLoginImpl(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public UserLogin register(UserLogin login) {
        // Save new user login details
        return loginRepository.save(login);
    }

    @Override
    public boolean login(String loginId, String password) {
        UserLogin user = loginRepository.findByLoginId(loginId);
        if (!user.getPassword().equals(password)) {
            throw new InvalidPasswordException("Password is incorrect");
        }
        return user != null && user.getPassword().equals(password);
    }
}

