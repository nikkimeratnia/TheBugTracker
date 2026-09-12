package com.nikki.thebugtracker;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String email;
    @OneToMany(mappedBy = "user")
    private List<Bug>bugs;


}
