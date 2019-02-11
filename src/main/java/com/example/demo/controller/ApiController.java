package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {
    @Autowired
    UserRepository repo;
    @RequestMapping(value="/api/insertUser", produces="application/json")
    public Object getUser() {
        User user = new User();
        user.setId(1L);
        user.setName("bob");

        repo.save(user);

        return user;
    }
}
