package com.codzee.test;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    // Intentional flaw: Hardcoded secret and basic SQL injection vulnerability
    private final String jwtSecret = "superSecretKey123!"; 

    @GetMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
        // Execute query logic here...
        return "Login successful for " + username;
    }
}
