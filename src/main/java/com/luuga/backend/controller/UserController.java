package com.luuga.backend.controller;

import com.luuga.backend.model.User;
import com.luuga.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/saveUser")
    public ResponseEntity<String> saveUser(@RequestBody List<User> userData){
        userRepository.saveAll(userData);
        return ResponseEntity.ok("User data saved");
    }

    @GetMapping("/getUser")
    public List<User> getAllusers(){
        return userRepository.findAll();
    }

}
