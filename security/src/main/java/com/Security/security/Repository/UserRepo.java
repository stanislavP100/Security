package com.Security.security.Repository;

import com.Security.security.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUserName(String name);
}
