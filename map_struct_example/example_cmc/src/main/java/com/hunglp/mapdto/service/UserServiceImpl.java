package com.hunglp.mapdto.service;

import com.hunglp.mapdto.dto.UserDto;
import com.hunglp.mapdto.entity.User;
import com.hunglp.mapdto.mapper.UserMapper;
import com.hunglp.mapdto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public Page<UserDto> getAllUser(Pageable pageable) {
        return userRepository.findAll(pageable).map(userMapper::toDto);
    }
}
