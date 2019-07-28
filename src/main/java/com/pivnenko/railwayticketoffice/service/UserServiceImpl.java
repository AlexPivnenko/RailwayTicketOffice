package com.pivnenko.railwayticketoffice.service;

import com.pivnenko.railwayticketoffice.entity.User;
import com.pivnenko.railwayticketoffice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user, Integer id) {
        User updatedUser = userRepository.findById(id).get();
        System.out.println(updatedUser);
        updatedUser.setLogin(user.getLogin());
       // updatedUser.setFullname(user.getFullname());
        updatedUser.setPassword(user.getPassword());
        updatedUser.setEmail(user.getEmail());
//        updatedUser = user;
        userRepository.save(updatedUser);
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }


}