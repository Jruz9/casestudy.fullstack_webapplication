package com.github.Jcruz9.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private String username;

}
