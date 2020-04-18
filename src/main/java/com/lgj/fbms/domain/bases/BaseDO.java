package com.lgj.fbms.domain.bases;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/6 17:51
 * @description：基础DO类
 * @modified By：
 * @version: 1.0
 */
@Data
public class BaseDO {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    @TableField("create_time")
    private Date createTime;

    @TableField("last_update_time")
    private Date lastUpdateTime;

}
