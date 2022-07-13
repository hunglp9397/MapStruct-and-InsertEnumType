package com.hunglp.mapdto.dto;


import com.hunglp.mapdto.entity.Gender;
import com.hunglp.mapdto.entity.Permission;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {
    private Long id;
    private String name;
    private Set<Permission> permissions;
    private Gender gender;
}
