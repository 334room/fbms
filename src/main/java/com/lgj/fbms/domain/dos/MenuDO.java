package com.lgj.fbms.domain.dos;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("menu")
public class MenuDO extends BaseDO {

    @TableField("parent_id")
    private Long parentId;

    @TableField("menu_name")
    private String menuName;

    @TableField("on_off")
    private Boolean onOff;

    @TableField("menu_rank_code")
    private String menuRankCode;

    @TableField("describe")
    private String describe;

}
