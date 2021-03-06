package com.lgj.fbms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lgj.fbms.domain.dos.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/6 18:03
 * @description：用户数据连接接口
 * @modified By：
 * @version: 1.0
 */
@Repository
@Mapper
public interface IUserMapper extends BaseMapper<UserDO> {
}
