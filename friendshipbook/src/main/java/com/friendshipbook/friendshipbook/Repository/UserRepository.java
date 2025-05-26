package com.friendshipbook.friendshipbook.Repository;

import com.friendshipbook.friendshipbook.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUsername (String username);

    Optional<User> findByEmail(String email);

    @NonNull
    Optional<User> findById (@NonNull Long id);
    List<User> findAllUsers();


    //void deleteUser(Long id);
}
