package com.fitness.controller;

import com.fitness.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users/home")
    public String homePage() {
        Authentication auth = SecurityContextHolder
                .getContext()
                .getAuthentication();
        String username = auth.getName();
        return username + " is authenticated";
    }

}
