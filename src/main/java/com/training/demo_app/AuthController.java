package com.training.demo_app;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    List<User> users =null;
    private Long userIdSequence = 1L;

    //Constructor intialization
    public AuthController() {

        users = new ArrayList<>();
        // Initialize with default users only once
        users.add(new User(1L, "Alice", "alice@example.com", "pass123", 22));
        users.add(new User(2L, "Bob", "bob@example.com", "secure456", 30));
        users.add(new User(3L, "Charlie", "charlie@example.com", "hello789", 27));
    }


    @PostMapping("/signup")
    public String signup(@RequestBody User user) {
        boolean exists = users.stream().anyMatch(u -> u.getEmail().equals(user.getEmail()));
        if (exists) {
            return "User already exists!";
        }

        user.setId(userIdSequence++);  // auto-assign ID
        users.add(user);
        return "Signup successful!";
    }

    @PostMapping("/login")
    public String login(@RequestBody User loginUser) {
        boolean valid = users.stream().anyMatch(u ->
                u.getEmail().equals(loginUser.getEmail()) &&
                        u.getPassword().equals(loginUser.getPassword())
        );

        if (valid) {
            return "Login successful!";
        }

        return "Invalid email or password!";
    }


    @GetMapping("/all")
    public List<User> getAllUsers() {
        return users;
    }
}
