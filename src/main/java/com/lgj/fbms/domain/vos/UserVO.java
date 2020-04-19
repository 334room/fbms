package com.lgj.fbms.domain.vos;

import lombok.Data;

import java.util.Date;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/18 17:05
 * @description：用户扩展类
 * @modified By：
 * @version: 1.0
 */

@Data
public class UserVO {

    private String account;

    private String password;

    private String userName;

    private String sex;

    private Date birthday;

    private String photoUrl;

    private String cellPhoneNumber;

    private String email;

}
