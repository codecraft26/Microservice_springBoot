package com.example.userservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @Column(name="id")
    private String UserId;
    @Column(name="FirstName")
    private String FirstName;
    @Column(name="LastName")
    private String LastName;
    @Column(name="Email")
    private String Email;
    @Column(name="Password")
    private String Password;
    @Column(name="about")
    private String about;



}
