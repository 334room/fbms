package com.lgj.fbms.controller;

import com.lgj.fbms.domain.dtos.UserDTO;
import com.lgj.fbms.service.IUserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/6 17:47
 * @description：用户控制类
 * @modified By：
 * @version: 1.0
 */

@Api(tags = "用户接口")
@RestController
@Slf4j
@RequestMapping("/api/fbms/user")
public class UserController {

    @Resource
    private IUserService userService;

}
