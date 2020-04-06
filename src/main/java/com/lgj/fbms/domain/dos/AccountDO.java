package com.lgj.fbms.domain.dos;

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
public class AccountDO extends BaseDO {

    private String account;

    private String password;

    private Long roleId;
}
