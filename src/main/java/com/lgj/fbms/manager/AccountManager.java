package com.lgj.fbms.manager;

import com.lgj.fbms.mapper.IAccountMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/18 16:40
 * @description：账号管理器
 * @modified By：
 * @version: 1.0
 */

@Component
public class AccountManager {

    @Resource
    private IAccountMapper accountMapper;
}
