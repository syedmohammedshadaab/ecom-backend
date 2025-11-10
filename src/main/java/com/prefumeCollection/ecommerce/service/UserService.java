package com.prefumeCollection.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.prefumeCollection.ecommerce.model.User;
import com.prefumeCollection.ecommerce.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User postUser(User user) {
        // ✅ Hash password before saving
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);
        return userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User getUser(String email, String rawPassword) {
        User user = userRepository.findByEmail(email);
        if (user != null && passwordEncoder.matches(rawPassword, user.getPassword())) {
            return user;
        }
        return null;
    }
}
