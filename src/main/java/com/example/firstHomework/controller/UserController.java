package com.example.firstHomework.controller;
import com.example.firstHomework.entity.User;
import com.example.firstHomework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/get/{id}")
    public Optional<User> getUser(@PathVariable Long id) {

        return userService.getById(id);
    }

    @PostMapping(path = "/add")
    public User createUser(@RequestBody User user) {
        User userToBeCreated = new User();
        userToBeCreated.setFirstName(user.getFirstName());
        userToBeCreated.setLastName(user.getLastName());
        userToBeCreated.setEmail(user.getPhoneNumber());
        userToBeCreated.setCreatedAt(user.getCreatedAt());
        userToBeCreated.setPhoneNumber(user.getPhoneNumber());

        return this.userService.saveUser(userToBeCreated);
    }

    @DeleteMapping("/remove/{id}")
    public String deleteUser(@PathVariable Long id){
        this.userService.deleteById(id);
        return String.format("User with %s id is deleted", id);
    }
}
