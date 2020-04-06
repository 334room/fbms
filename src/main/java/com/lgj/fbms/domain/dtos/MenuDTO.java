package com.lgj.fbms.domain.dtos;

import com.lgj.fbms.domain.bases.BaseDTO;
import com.lgj.fbms.domain.enums.MenuRankEnum;
import lombok.Data;

import java.util.List;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/6 19:18
 * @description：菜单数据传输对象
 * @modified By：
 * @version: 1.0
 */

@Data
public class MenuDTO extends BaseDTO {

    private List<MenuDTO> children;

    private Long parentId;

    private String menuName;

    private Boolean onOff;

    private MenuRankEnum menuRankEnum;

    private String describe;
}
