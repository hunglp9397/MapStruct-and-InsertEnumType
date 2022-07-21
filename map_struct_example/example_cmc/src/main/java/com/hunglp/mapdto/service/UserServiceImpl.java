package com.hunglp.mapdto.service;

import com.hunglp.mapdto.dto.UserDto;
import com.hunglp.mapdto.entity.Identity;
import com.hunglp.mapdto.entity.User;
import com.hunglp.mapdto.mapper.UserMapper;
import com.hunglp.mapdto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

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

    @Override
    public void saveUser(UserDto userDto) {
        userRepository.save(userMapper.toEntity(userDto));
    }

    @Override
    public void saveUser(User user) {
        Identity identity = new Identity();
        identity.setIdNumber(user.getIdentity().getIdNumber());
        identity.setUser(user);
        user.setIdentity(identity);
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void removeById(Long id) {
        userRepository.removeUserById(id);
    }


}
