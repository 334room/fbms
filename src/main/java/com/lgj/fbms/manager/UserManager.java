package com.lgj.fbms.manager;

import com.lgj.fbms.domain.dos.UserDO;
import com.lgj.fbms.domain.dtos.UserDTO;
import com.lgj.fbms.mapper.IUserMapper;
import com.lgj.fbms.utils.DozerBeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/18 16:19
 * @description：用户管理器
 * @modified By：
 * @version: 1.0
 */
@Component
public class UserManager extends BaseManager<IUserMapper, UserDO> {


}
