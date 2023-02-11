package com.example.firstHomework.runner;

import com.example.firstHomework.entity.Address;
import com.example.firstHomework.entity.User;
import com.example.firstHomework.repository.AddressRepository;
import com.example.firstHomework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;


@Component
public class CommandRunner implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {

        createUser();
        createAddress();

    }

    public void createUser(){
        User user = new User();
        user.setFirstName("Boris");
        user.setLastName("Ivanov");
        user.setPhoneNumber("555555");
        user.setEmail("hsgdhsdgv@ashdh");
        user.setCreatedAt(Instant.now());

        userRepository.save(user);

        User user1 = new User();
        user.setFirstName("Georgi");
        user.setLastName("Petrov");
        user.setPhoneNumber("666666");
        user.setEmail("oijoijoij@ashdh");
        user.setCreatedAt(Instant.now());

        userRepository.save(user1);

    }

    public void createAddress(){
        Address address = new Address();
        address.setCountry("Bulgaria");
        address.setCity("Burgas");
        address.setStreet("Roza");
        address.setStreetNumber("8");

        addressRepository.save(address);

        Address address1 = new Address();
        address.setCountry("Bulgaria");
        address.setCity("Varna");
        address.setStreet("Plovdiv");
        address.setStreetNumber("6");

        addressRepository.save(address1);

    }

}
