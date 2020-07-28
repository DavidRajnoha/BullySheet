package com.drajnoha.BullySheet.dao.accessors;

import com.drajnoha.BullySheet.dao.entities.User;
import com.drajnoha.BullySheet.dao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author David Rajnoha
 */
public class UserAccessorImpl implements UserAccessor{

    private final UserRepository userRepository;

    @Autowired
    public UserAccessorImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(String token) {
        User user = new User();
        user.setToken(token);
        return userRepository.save(user);
    }

    @Override
    public User getUser(String token) {
        return userRepository.findOneUserByToken(token);
    }
}
