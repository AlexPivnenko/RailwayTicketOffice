package com.pivnenko.railwayticketoffice.conroller;

import com.pivnenko.railwayticketoffice.entity.User;
import com.pivnenko.railwayticketoffice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/hi")
    public String sayHi() {
        return "hallo";
    }
    @GetMapping(value = "/users")
    public List<User> getAllUsers() {
        return userService.getAll();
    }
    @GetMapping(value = "/users/{id}")
    public User getUser(@PathVariable Integer id) {
        return userService.getUser(id);
    }

    @PostMapping(value = "/users")
    public void addNewUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @PutMapping(value = "/users/{id}")
    public void updateUser(@RequestBody User user, @PathVariable Integer id) {
        userService.updateUser(user, id);
    }

    @DeleteMapping(value = "/users/{id}")
    public void updateUser( @PathVariable Integer id) {
        userService.deleteUser(id);
    }
}
