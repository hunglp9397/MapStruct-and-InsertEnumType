package com.hunglp.mapdto.repository;

import com.hunglp.mapdto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    void removeUserById(Long id);
}
