package com.lgj.fbms.controller;

import com.lgj.fbms.domain.dtos.AccountDTO;
import com.lgj.fbms.domain.dtos.UserDTO;
import com.lgj.fbms.domain.vos.UserVO;
import com.lgj.fbms.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

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

    @ApiOperation("注册")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "userVO", value = "注册信息", dataType = "UserVO")
    )
    @PostMapping("/register")
    public AccountDTO register(@RequestBody UserVO userVO) throws Exception {
        if (Objects.isNull(userVO)) {
            return null;
        }
        return userService.register(userVO);
    }

}
