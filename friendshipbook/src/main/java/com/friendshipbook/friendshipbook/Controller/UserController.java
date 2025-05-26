package com.friendshipbook.friendshipbook.Controller;

import com.friendshipbook.friendshipbook.Model.User;
import com.friendshipbook.friendshipbook.Service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users") //Basis URL
public class UserController {

    private final UserServiceInterface userServiceInterface;

    @Autowired
    public UserController(UserServiceInterface userServiceInterface) {
        this.userServiceInterface = userServiceInterface;
    }

    //create a User
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {

        User newUser = userServiceInterface.saveUser(user);
        //response http with 200
        return ResponseEntity.ok(newUser);
    }
}
