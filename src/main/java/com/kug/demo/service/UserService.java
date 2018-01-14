package com.kug.demo.service;

import com.kug.demo.repo.UserRepository;
import com.kug.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void createUser(User user) {
        repository.save(user);
    }

    public User getUser(Long id) {
        return repository.findOne(id);
    }

    public Iterable<User> getUsers() {
        List<User> users = new ArrayList<>();
        Iterable<User> userIterable = repository.findAll();
        userIterable.iterator().forEachRemaining(users::add);
        return users;
    }
}
