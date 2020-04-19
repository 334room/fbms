package com.lgj.fbms.service.impl;

import com.lgj.fbms.manager.MenuManager;
import com.lgj.fbms.service.IMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/18 16:36
 * @description：菜单服务类
 * @modified By：
 * @version: 1.0
 */

@Service
@Slf4j
public class MenuServiceImpl implements IMenuService {

    @Resource
    private MenuManager menuManager;
}
