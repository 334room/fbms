package com.lgj.fbms.manager;

import com.lgj.fbms.mapper.IUserMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/18 16:19
 * @description：用户管理器
 * @modified By：
 * @version: 1.0
 */
@Component
public class UserManager {

    @Resource
    private IUserMapper userMapper;

}
