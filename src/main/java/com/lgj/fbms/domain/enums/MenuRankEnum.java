package com.lgj.fbms.domain.enums;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/6 19:07
 * @description：菜单等级
 * @modified By：
 * @version: 1.0
 */
public enum MenuRankEnum {
    /**
     * 预设5个等级，一般最多使用三个等级
     */
    LEVEL1("level1","一级菜单"),
    LEVEL2("level2","二级菜单"),
    LEVEL3("level3","三级菜单"),
    LEVEL4("level4","四级菜单"),
    LEVEL5("level5","五级菜单");

    private String code;

    private String message;

    MenuRankEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
