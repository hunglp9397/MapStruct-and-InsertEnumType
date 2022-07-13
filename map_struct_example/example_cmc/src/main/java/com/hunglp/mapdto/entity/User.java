package com.hunglp.mapdto.entity;

import com.hunglp.mapdto.dto.UserDto;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ElementCollection(targetClass = Permission.class)
    @JoinTable(name = "user_permission", joinColumns  = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "permission")
    private Set<Permission> permissions;

    @Enumerated(EnumType.STRING)
    private Gender gender;




}
