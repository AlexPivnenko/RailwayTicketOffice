package com.pivnenko.railwayticketoffice.service;

import com.pivnenko.railwayticketoffice.entity.User;

import java.util.List;

public interface UserService {
        List<User> getAll();
        User getUser(Integer id);
        void addUser(User user);
        void updateUser(User user, Integer id);
        void deleteUser(Integer id);
}
