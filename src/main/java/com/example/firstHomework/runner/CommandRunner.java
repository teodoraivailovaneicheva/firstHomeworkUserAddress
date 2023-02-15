package com.example.firstHomework.runner;

import com.example.firstHomework.entity.Address;
import com.example.firstHomework.entity.User;
import com.example.firstHomework.repository.AddressRepository;
import com.example.firstHomework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Optional;

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
        getUser();
        getAddress();

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

    public void getUser() {
        Optional<User> user1 = userRepository.findById(1L);
        user1.ifPresent(value -> System.out.println());

        Optional<User> user2 = userRepository.findById(1L);
        user2.ifPresent(value -> System.out.println());
    }

    public void getAddress() {
        Optional<Address> address1 = addressRepository.findById(1L);
        address1.ifPresent(value -> System.out.println());

        Optional<Address> address2 = addressRepository.findById(1L);
        address2.ifPresent(value -> System.out.println());
    }

}
