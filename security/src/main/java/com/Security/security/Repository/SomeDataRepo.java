package com.Security.security.Repository;

import com.Security.security.Entity.SomeData;
import com.Security.security.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SomeDataRepo extends JpaRepository<SomeData,Long> {
    List<SomeData> findAllByUser(User user);
}
