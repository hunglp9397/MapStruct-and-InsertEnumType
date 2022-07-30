package com.hunglp.mapdto.repository;

import com.hunglp.mapdto.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    void removeUserById(Long id);

    @Query(value = "select u from User u where u.name like concat(:s, '%') ")
    Page<User> customizedFindAllUser(@Param("s") String s, Pageable pageable);

    @Modifying
    @Query(value = "update User u set u.address = upper(u.address) where u.name like concat(:s, '%') ")
    int updateUserSetAddressUppercase(@Param("s") String s);
}
