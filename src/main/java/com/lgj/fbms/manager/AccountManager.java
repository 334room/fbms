package com.lgj.fbms.manager;

import com.lgj.fbms.domain.dos.AccountDO;
import com.lgj.fbms.domain.dtos.AccountDTO;
import com.lgj.fbms.mapper.IAccountMapper;
import com.lgj.fbms.utils.DozerBeanUtils;
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

    public int insertOne(AccountDTO accountDTO) {
        AccountDO accountDO = DozerBeanUtils.map(accountDTO, AccountDO.class);
        int count = accountMapper.insert(accountDO);
        if (count == 1) {
            accountDTO.setId(accountDO.getId());
            return count;
        }
        return 0;
    }

    public int deleteById(Long id){
       return accountMapper.deleteById(id);
    }
}
