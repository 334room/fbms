package com.lgj.fbms.service.impl;

import com.lgj.fbms.manager.UserManager;
import com.lgj.fbms.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/6 18:01
 * @description：用户服务类
 * @modified By：
 * @version: 1.0
 */
@Service
@Slf4j
public class UserServiceImpl implements IUserService {

    @Resource
    private UserManager userManager;

}
