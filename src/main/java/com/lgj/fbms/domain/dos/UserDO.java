package com.lgj.fbms.domain.dos;

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
public class UserDO extends BaseDO {

    private String userName;

    private String sex;

    private Date birthday;

    private String photoUrl;

    private String cellPhoneNumber;

    private String email;

    private Long accountId;

}
