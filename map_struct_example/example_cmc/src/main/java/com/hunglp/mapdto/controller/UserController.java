package com.hunglp.mapdto.controller;

import com.hunglp.mapdto.dto.UserDto;
import com.hunglp.mapdto.entity.Identity;
import com.hunglp.mapdto.entity.User;
import com.hunglp.mapdto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Page<UserDto> getAllUser(Pageable pageable){
        return userService.getAllUser(pageable);
    }

    @PostMapping("/users")
    public void saveUser(@RequestBody UserDto userDto){
         userService.saveUser(userDto);
    }

    @PostMapping("/users2")
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @DeleteMapping("/users2")
    public void deleteUser(@RequestParam Long id){
       userService.removeById(id);

    }

}
