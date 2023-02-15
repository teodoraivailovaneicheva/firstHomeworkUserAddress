package com.example.firstHomework.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;

@Data
@Getter
@Setter
@Entity(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private  String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    private Instant createdAt;
    @OneToMany(mappedBy  = "user", fetch = FetchType.LAZY)
    private Set<Address> addresses;
}
