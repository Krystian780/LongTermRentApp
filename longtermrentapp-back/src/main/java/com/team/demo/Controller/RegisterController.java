package com.team.demo.Controller;

import com.team.demo.Exceptions.UserAlreadyExistException;
import com.team.demo.OfferModel.User;
import com.team.demo.security.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class RegisterController {
    @Autowired
    UserService userService;

    @PostMapping("/user/registration")
    public void registerUserAccount(
            @RequestBody User user) {
        try {
            User registered = userService.registerNewUserAccount(user);
        } catch (UserAlreadyExistException uaeEx) {
            System.out.println("User exists");
        }
        userService.registerNewUserAccount(user);
    }

}
