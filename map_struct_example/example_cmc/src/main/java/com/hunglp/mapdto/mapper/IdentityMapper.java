package com.hunglp.mapdto.mapper;

import com.hunglp.mapdto.dto.IdentityDto;
import com.hunglp.mapdto.dto.UserDto;
import com.hunglp.mapdto.entity.Identity;
import com.hunglp.mapdto.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IdentityMapper extends GenericMapper<IdentityDto, Identity>{
}
