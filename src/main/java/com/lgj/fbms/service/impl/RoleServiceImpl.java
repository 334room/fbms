package com.lgj.fbms.service.impl;

import com.lgj.fbms.manager.RoleManager;
import com.lgj.fbms.service.IRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/18 16:38
 * @description：角色服务类
 * @modified By：
 * @version: 1.0
 */

@Service
@Slf4j
public class RoleServiceImpl implements IRoleService {

    @Resource
    private RoleManager roleManager;
}
