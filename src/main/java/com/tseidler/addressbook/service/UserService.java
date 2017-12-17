package com.tseidler.addressbook.service;

import com.tseidler.addressbook.domain.User;
import com.tseidler.addressbook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User getUserByCity(String city) {
        ArrayList<User> users = userRepository.getByCity(city);
    }
}
