package com.lgj.fbms.controller;

import com.lgj.fbms.service.IRoleService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/18 16:26
 * @description：角色控制类
 * @modified By：
 * @version: 1.0
 */

@Api(tags = "角色接口")
@RestController
@Slf4j
@RequestMapping("/api/fbms/role")
public class RoleController {

    @Resource
    private IRoleService roleService;
}
