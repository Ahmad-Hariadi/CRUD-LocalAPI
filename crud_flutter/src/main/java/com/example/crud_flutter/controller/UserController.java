package com.example.crud_flutter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud_flutter.model.User;
import com.example.crud_flutter.service.IUserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    IUserService userService;

    @PostMapping("/insertUser")
    public User insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }

    @GetMapping("/getUser")
    public List<User> getUser() {
        return userService.getUser();
    }

    @PutMapping("/updateUser/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public User deleteUser(@PathVariable int id) {
        return userService.deleteUser(id);
    }
}
