package com.nikki.thebugtracker;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(mappedBy = "user")
    private List<Bug>bugs;
    private String username;
    private String email;
    public User(String username,String email){
        this.username = username;
        this.email = email;
    }
    public User(){

    }

}
