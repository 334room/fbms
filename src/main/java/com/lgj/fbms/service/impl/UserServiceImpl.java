package com.lgj.fbms.service.impl;

import com.lgj.fbms.domain.dos.AccountDO;
import com.lgj.fbms.domain.dos.UserDO;
import com.lgj.fbms.domain.dtos.AccountDTO;
import com.lgj.fbms.domain.dtos.UserDTO;
import com.lgj.fbms.domain.vos.UserVO;
import com.lgj.fbms.exception.FbmsErrorCode;
import com.lgj.fbms.exception.FbmsException;
import com.lgj.fbms.manager.AccountManager;
import com.lgj.fbms.manager.UserManager;
import com.lgj.fbms.service.IUserService;
import com.lgj.fbms.utils.DozerBeanUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Resource
    private AccountManager accountManager;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public AccountDTO register(UserVO userVO) throws Exception {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setAccount(userVO.getAccount());
        accountDTO.setPassword(userVO.getPassword());
        AccountDO accountDO = DozerBeanUtils.map(accountDTO, AccountDO.class);
        int count = accountManager.insertOne(accountDO);
        if (count == 0) {
            throw new FbmsException(FbmsErrorCode.REGISTER_FAIL.getMessage());
        }
        UserDTO userDTO = DozerBeanUtils.map(userVO, UserDTO.class);
        userDTO.setAccountId(accountDO.getId());
        UserDO userDO=DozerBeanUtils.map(userDTO, UserDO.class);
        count = userManager.insertOne(userDO);
        if (count == 0) {
            accountManager.deleteById(accountDTO.getId());
            throw new FbmsException(FbmsErrorCode.REGISTER_FAIL.getMessage());
        }
        return accountDTO;
    }
}
