package com.hunglp.mapdto.custom_annotation;


import com.hunglp.mapdto.entity.Permission;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AuthorizedFor {

    Permission permission();
}
