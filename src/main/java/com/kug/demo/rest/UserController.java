package com.kug.demo.rest;

import com.kug.demo.domain.User;
import com.kug.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable(value = "id") Long id) {
                return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<User> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }
}
