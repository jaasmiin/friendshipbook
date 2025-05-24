package com.friendshipbook.friendshipbook.Repository;

import com.friendshipbook.friendshipbook.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
}
