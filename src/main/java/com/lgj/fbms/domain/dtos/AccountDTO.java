package com.lgj.fbms.domain.dtos;

import com.lgj.fbms.domain.bases.BaseDTO;
import lombok.Data;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/6 19:21
 * @description：账号数据传输对象
 * @modified By：
 * @version: 1.0
 */

@Data
public class AccountDTO extends BaseDTO {

    private String account;

    private String password;

    private Long roleId;

}
