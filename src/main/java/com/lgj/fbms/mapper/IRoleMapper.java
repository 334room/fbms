package com.lgj.fbms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lgj.fbms.domain.dos.RoleDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/18 16:44
 * @description：角色数据连接接口
 * @modified By：
 * @version: 1.0
 */

@Repository
@Mapper
public interface IRoleMapper extends BaseMapper<RoleDO> {
}
