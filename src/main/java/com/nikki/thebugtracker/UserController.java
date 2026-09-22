package com.nikki.thebugtracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping("/signUp" )
    public String signUpUser(){
        return "signUp";
    }
    @PostMapping("/signUp")
    public String registerUser(@RequestParam("username") String username,@RequestParam("email") String email){
        User newUser = new User(username,email);
        userService.saveUser(newUser);
        return "success";

    }



}
