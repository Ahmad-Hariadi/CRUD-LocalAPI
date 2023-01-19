package com.example.crud_flutter.service;

import java.util.List;

import com.example.crud_flutter.model.User;

public interface IUserService {
    public User insertUser(User user);
    public List<User> getUser();
    public User updateUser(int id, User user);
    public User deleteUser(int id);
}
