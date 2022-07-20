package com.hunglp.mapdto.dto;

import com.hunglp.mapdto.entity.AbstractEntity;
import com.hunglp.mapdto.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IdentityDto extends AbstractEntity implements Serializable {

    private Long id;

    private String idNumber;


    private UserDto userDto;
}
