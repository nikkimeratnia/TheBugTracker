package com.nikki.thebugtracker;

import jakarta.persistence.*;

@Entity
@Table(name = "bugs")
public class Bug {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String description;
}
