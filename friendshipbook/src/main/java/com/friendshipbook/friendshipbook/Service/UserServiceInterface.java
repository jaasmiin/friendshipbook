package com.friendshipbook.friendshipbook.Service;

import com.friendshipbook.friendshipbook.Model.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {


    User saveUser (User user);
    Optional<User> findUserById(Long id);
    Optional<User> findUserByEmail (String email);
    Optional<User> findUserByUsername(String username);
    List<User> findAllUsers();
    void deleteUser(Long id);
}
