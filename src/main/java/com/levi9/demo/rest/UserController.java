package com.levi9.demo.rest;

import com.levi9.demo.UserService;
import com.levi9.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User getUser(@RequestParam("userName") String username, @RequestParam("id") Long id) {
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
    public void createUser(User user) {
        userService.createUser(user);
    }
}
