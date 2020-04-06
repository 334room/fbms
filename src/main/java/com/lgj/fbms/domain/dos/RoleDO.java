package com.lgj.fbms.domain.dos;

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
public class RoleDO extends BaseDO {

    private String roleName;

    private String describe;

    private String remark;
}
