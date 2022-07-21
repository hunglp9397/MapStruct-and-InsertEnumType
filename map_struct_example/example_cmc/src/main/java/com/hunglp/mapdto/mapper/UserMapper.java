package com.hunglp.mapdto.mapper;

import com.hunglp.mapdto.dto.UserDto;
import com.hunglp.mapdto.entity.User;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring",uses = IdentityMapper.class)
public interface UserMapper extends GenericMapper<UserDto, User> {

    @AfterMapping
    default void updateResult(@MappingTarget UserDto userDto){
        userDto.setName(userDto.getName().toUpperCase());
    }

    @Override
    @Mapping(source = "identityDto", target = "identity")
    User toEntity(UserDto dto);


    @Override
    @Mapping(source = "identity", target = "identityDto")
    UserDto toDto(User entity);
}
