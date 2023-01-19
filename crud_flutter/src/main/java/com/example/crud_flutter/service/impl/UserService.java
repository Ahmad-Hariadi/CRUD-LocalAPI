package com.example.crud_flutter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud_flutter.model.User;
import com.example.crud_flutter.repository.IUserRepository;
import com.example.crud_flutter.service.IUserService;

@Service
public class UserService implements IUserService{

    @Autowired
    IUserRepository userRepository;

    @Override
    public User insertUser(User user) {
        // TODO Auto-generated method stub
        return userRepository.insertUser(user);
    }

    @Override
    public List<User> getUser() {
        // TODO Auto-generated method stub
        return userRepository.getUser();
    }

    @Override
    public User updateUser(int id, User user) {
        // TODO Auto-generated method stub
        return userRepository.updateUser(id, user);
    }

    @Override
    public User deleteUser(int id) {
        // TODO Auto-generated method stub
        return userRepository.deleteUser(id);
    }
    
}
