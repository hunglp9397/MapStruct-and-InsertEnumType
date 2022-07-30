package com.hunglp.mapdto.aop;

import com.hunglp.mapdto.custom_annotation.AuthorizedFor;
import com.hunglp.mapdto.entity.Permission;
import com.hunglp.mapdto.exception.UnauthorizedException;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class AuthorizationAOP {

    @Autowired
    private HttpServletRequest request;

    @Before("@annotation(authorizedFor)")
    private void checkPermissionBeforeRequest(AuthorizedFor authorizedFor) {
        String permissionHeader = request.getHeader("permission");
        if (permissionHeader == null) {
            throw new UnauthorizedException("Permission is required");
        }
        Permission permission = Permission.of(permissionHeader);
        if (permission == null) {
            throw new UnauthorizedException("Permission denied");
        }

    }
}
