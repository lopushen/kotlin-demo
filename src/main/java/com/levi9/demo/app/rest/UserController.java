package com.levi9.demo.app.rest;

import com.levi9.demo.app.domain.User;
import com.levi9.demo.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping(method = RequestMethod.GET)
    public User getUser(@RequestParam(value = "userName", required = false) String username, @RequestParam(value =
            "id", required = false) Long id) {
        return userService.getUser(username);


    }

    @RequestMapping(method = RequestMethod.POST)
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }
}
