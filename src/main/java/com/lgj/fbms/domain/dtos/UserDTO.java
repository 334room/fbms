package com.lgj.fbms.domain.dtos;

import com.lgj.fbms.domain.bases.BaseDTO;
import lombok.Data;

import java.util.Date;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/6 17:53
 * @description：学生数据传输对象
 * @modified By：
 * @version: 1.0
 */

@Data
public class UserDTO extends BaseDTO {

    private String userName;

    private String sex;

    private Date birthday;

    private String photoUrl;

    private String cellPhoneNumber;

    private String email;

    private Long accountId;

}
