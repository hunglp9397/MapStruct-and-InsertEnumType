package com.hunglp.mapdto.service;

import com.hunglp.mapdto.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    public Page<UserDto> getAllUser(Pageable pageable);

}
