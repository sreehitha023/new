package com.msf.ValidationExample.repository;

import com.msf.ValidationExample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Integer> {
    User findByUserId(int id);
}
