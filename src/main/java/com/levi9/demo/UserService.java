package com.levi9.demo;

import com.levi9.demo.domain.User;
import com.levi9.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void createUser(User user) {
        repository.createUser(user);
    }

    public User getUser(String name) {
        return repository.findByName(name);
    }


    public User getUser(Long id) {
        return repository.findById(id);
    }

    public User getUser(String username, Long id) {
        return repository.findById(id);
    }
}
