package com.levi9.demo.rest;

import com.levi9.demo.service.UserService;
import com.levi9.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public User getUser(@RequestParam(value = "userName", required = false) String username, @RequestParam(value = "id", required = false) Long id) {
        if (id!=null && username!=null) {
            throw new IllegalArgumentException("Please specify only one parameter");
        }
            if (username!=null) {
                return userService.getUser(username);
            }
            if (id!=null) {
                return userService.getUser(id);
            }
            throw new IllegalArgumentException("Please specify at least one parameter");
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }
}
