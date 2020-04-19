package com.lgj.fbms.exception;

import lombok.Data;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/18 18:19
 * @description：异常值
 * @modified By：
 * @version: 1.0
 */

public enum FbmsErrorCode {

    REGISTER_FAIL("注册失败");

    private String message;

    public String getMessage() {
        return message;
    }

    FbmsErrorCode(String message) {
        this.message = message;
    }
}
