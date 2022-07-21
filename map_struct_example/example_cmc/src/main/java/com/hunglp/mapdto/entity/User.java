package com.hunglp.mapdto.entity;

import com.hunglp.mapdto.converter.GenderEnumConverter;
import com.hunglp.mapdto.converter.PermissionEnumConverter;
import com.hunglp.mapdto.dto.UserDto;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;


    @Convert(converter = GenderEnumConverter.class)
    private Gender gender;

    @ElementCollection(targetClass = Permission.class, fetch = FetchType.EAGER)
    @JoinTable(name = "user_permission", joinColumns  = @JoinColumn(name = "id"))
    @Convert(converter = PermissionEnumConverter.class)
    @Column(name = "permission")
    private Set<Permission> permissions;


//    @Convert(converter = PermissionEnumConverter.class)
//    private Permission permission;


    @OneToOne(mappedBy = "user", cascade = CascadeType.PERSIST)
    private Identity identity;


}
