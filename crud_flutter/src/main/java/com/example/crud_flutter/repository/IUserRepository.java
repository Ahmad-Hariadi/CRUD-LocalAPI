package com.example.crud_flutter.repository;

import java.util.List;

import com.example.crud_flutter.model.User;

public interface IUserRepository {
    public User insertUser(User user);
    public List<User> getUser();
    public User updateUser(int id, User user);
    public User deleteUser(int id);
}
