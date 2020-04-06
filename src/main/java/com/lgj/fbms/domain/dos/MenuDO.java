package com.lgj.fbms.domain.dos;

import com.lgj.fbms.domain.bases.BaseDO;
import lombok.Data;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/6 18:44
 * @description：菜单实体类
 * @modified By：
 * @version: 1.0
 */

@Data
public class MenuDO extends BaseDO {

    private Long parentId;

    private String menuName;

    private Boolean onOff;

    private String menuRankCode;

    private String describe;

}
