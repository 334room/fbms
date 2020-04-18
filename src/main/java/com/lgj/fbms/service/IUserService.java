package com.lgj.fbms.service;

import com.lgj.fbms.domain.dtos.AccountDTO;
import com.lgj.fbms.domain.vos.UserVO;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/6 18:01
 * @description：用户服务接口
 * @modified By：
 * @version: 1.0
 */
public interface IUserService {

    /**
     * 注册
     *
     * @param userVO
     * @return 用户信息
     * @throws Exception
     */
    AccountDTO register(UserVO userVO) throws Exception;
}
