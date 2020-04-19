package com.lgj.fbms.domain.dos;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lgj.fbms.domain.bases.BaseDO;
import lombok.Data;

import java.util.Date;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/6 17:53
 * @description：学生实体类
 * @modified By：
 * @version: 1.0
 */

@Data
@TableName("user")
public class UserDO extends BaseDO {

    @TableField("user_name")
    private String userName;

    @TableField("sex")
    private String sex;

    @TableField("birthday")
    private Date birthday;

    @TableField("photo_url")
    private String photoUrl;

    @TableField("cell_phone_number")
    private String cellPhoneNumber;

    @TableField("email")
    private String email;

    @TableField("account_id")
    private Long accountId;

}
