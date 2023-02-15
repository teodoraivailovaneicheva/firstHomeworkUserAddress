package com.example.firstHomework.service;
import com.example.firstHomework.entity.User;
import com.example.firstHomework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
        User userToBeCreated = new User();
        userToBeCreated.setFirstName(user.getFirstName());
        userToBeCreated.setLastName(user.getLastName());
        userToBeCreated.setEmail(user.getEmail());
        userToBeCreated.setPhoneNumber(user.getPhoneNumber());

        return userRepository.save(userToBeCreated);
    }

    public Optional<User> getById(Long id){

        return userRepository.findById(id);
    }

    public void deleteById(Long id){

        this.userRepository.deleteById(id);
    }
}

