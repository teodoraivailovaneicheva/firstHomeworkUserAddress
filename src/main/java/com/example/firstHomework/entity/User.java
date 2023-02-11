package com.example.firstHomework.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Data
@Getter
@Setter
@Entity(name = "users")

public class User {

    @Id
    private Long id;
    @Column(name = "first name")
    private  String firstName;
    @Column(name = "last name")
    private String lastName;
    @Column(name = "phone number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    @Column
    private Instant createdAt;
}
