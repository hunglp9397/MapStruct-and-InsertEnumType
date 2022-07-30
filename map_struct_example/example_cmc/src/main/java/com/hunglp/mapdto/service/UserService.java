package com.hunglp.mapdto.service;

import com.hunglp.mapdto.dto.UserDto;
import com.hunglp.mapdto.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserService {
    Page<UserDto> getAllUser(Pageable pageable);

    void saveUser(UserDto userDto);

    void saveUser(User user);

    void removeById(Long id);

    Page<UserDto> getUserHasNameStartWith(String s, Pageable pageable);

    int upperCaseFieldAddressWhereUserHasNameStartWith(String s);

}
