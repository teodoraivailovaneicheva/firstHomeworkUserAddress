package com.example.firstHomework.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity(name = "addresses")

public class Address {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "country")
        private  String country;
        @Column(name = "city")
        private String city;
        @Column(name = "street")
        private String street;
        @Column(name = "street number")
        private String streetNumber;
        @ManyToOne
        private User user;

}
