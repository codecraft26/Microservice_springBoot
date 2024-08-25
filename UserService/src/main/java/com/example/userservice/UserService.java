package com.example.userservice;

import com.example.userservice.entities.User;

import java.util.List;

public interface UserService {
public User createUser(User user);
    public User getUser(String userId);
    public List<User> getAllUsers();
    public User updateUser(User user);
    public void deleteUser(String userId);
    public void FindUserByEmail(String Email  );

}
