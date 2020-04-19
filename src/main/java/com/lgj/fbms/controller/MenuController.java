package com.lgj.fbms.controller;

import com.lgj.fbms.service.IMenuService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/18 16:31
 * @description：菜单控制类
 * @modified By：
 * @version: 1.0
 */

@Api(tags = "菜单接口")
@RestController
@Slf4j
@RequestMapping("/api/fbms/menu")
public class MenuController {

    @Resource
    private IMenuService menuService;
}
