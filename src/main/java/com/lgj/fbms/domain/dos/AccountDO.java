package com.lgj.fbms.domain.dos;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lgj.fbms.domain.bases.BaseDO;
import lombok.Data;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/6 18:47
 * @description：账号实体类
 * @modified By：
 * @version: 1.0
 */

@Data
@TableName("account")
public class AccountDO extends BaseDO {

    @TableField("account")
    private String account;

    @TableField("password")
    private String password;

    @TableField("role_id")
    private Long roleId;
}
