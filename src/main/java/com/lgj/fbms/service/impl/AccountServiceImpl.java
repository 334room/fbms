package com.lgj.fbms.service.impl;

import com.lgj.fbms.manager.AccountManager;
import com.lgj.fbms.service.IAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/18 16:35
 * @description：账号服务类
 * @modified By：
 * @version: 1.0
 */

@Service
@Slf4j
public class AccountServiceImpl implements IAccountService {

    @Resource
    private AccountManager accountManager;

}
