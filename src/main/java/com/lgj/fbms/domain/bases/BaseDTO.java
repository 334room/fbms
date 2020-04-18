package com.lgj.fbms.domain.bases;

import lombok.Data;

import java.util.Date;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/6 17:52
 * @description：基础DTO类
 * @modified By：
 * @version: 1.0
 */

@Data
public class BaseDTO {

    private Long id;

    private Date createTime;

    private Date lastUpdateTime;

}
