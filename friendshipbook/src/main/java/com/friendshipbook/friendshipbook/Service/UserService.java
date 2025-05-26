package com.friendshipbook.friendshipbook.Service;

import com.friendshipbook.friendshipbook.Model.User;
import com.friendshipbook.friendshipbook.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService implements UserServiceInterface{

    private final UserRepository userRepository;

    //Constructor
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //save a User
    @Override
    public User saveUser(User user){
         return userRepository.save(user);
    }
    //find User by ID
    @Override
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    //find User by Email
    @Override
    public Optional<User> findUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    //find user by username
    @Override
    public Optional<User> findUserByUsername(String username){
        return userRepository.findByUsername(username);
    }
    //find all users and return a List of them
    @Override
    public List<User> findAllUsers(){
        return userRepository.findAllUsers();
    }
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);    };
}
