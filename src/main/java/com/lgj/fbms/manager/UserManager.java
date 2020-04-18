package com.lgj.fbms.manager;

import com.lgj.fbms.domain.dos.UserDO;
import com.lgj.fbms.domain.dtos.UserDTO;
import com.lgj.fbms.mapper.IUserMapper;
import com.lgj.fbms.utils.DozerBeanUtils;
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

    public int insertOne(UserDTO userDTO) {
        UserDO userDO = DozerBeanUtils.map(userDTO, UserDO.class);
        int count = userMapper.insert(userDO);
        if (count == 1) {
            userDTO.setId(userDO.getId());
            return count;
        }
        return 0;
    }

}
