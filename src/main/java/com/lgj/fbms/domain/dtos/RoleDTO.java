package com.lgj.fbms.domain.dtos;

import com.lgj.fbms.domain.bases.BaseDTO;
import lombok.Data;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/6 19:16
 * @description：角色数据传输对象
 * @modified By：
 * @version: 1.0
 */

@Data
public class RoleDTO extends BaseDTO {

    private String roleName;

    private String describe;

    private String remark;
}
