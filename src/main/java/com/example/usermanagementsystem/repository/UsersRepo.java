package com.example.usermanagementsystem.repository;

import com.example.usermanagementsystem.entity.OurUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<OurUsers, Integer> {
    OurUsers findByUsername(String email);
}
