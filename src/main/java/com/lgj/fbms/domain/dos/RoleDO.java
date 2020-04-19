package com.lgj.fbms.domain.dos;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lgj.fbms.domain.bases.BaseDO;
import lombok.Data;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/6 18:42
 * @description：角色实体类
 * @modified By：
 * @version: 1.0
 */

@Data
@TableName("role")
public class RoleDO extends BaseDO {

    @TableField("role_name")
    private String roleName;

    @TableField("describe")
    private String describe;

    @TableField("remark")
    private String remark;
}
