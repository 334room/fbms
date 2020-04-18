package com.lgj.fbms.manager;

import com.lgj.fbms.mapper.IMenuMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/18 16:41
 * @description：菜单管理类
 * @modified By：
 * @version: 1.0
 */

@Component
public class MenuManager {

    @Resource
    private IMenuMapper menuMapper;
}
