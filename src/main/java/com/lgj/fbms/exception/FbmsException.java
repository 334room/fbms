package com.lgj.fbms.exception;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/18 18:19
 * @description：异常类
 * @modified By：
 * @version: 1.0
 */
public class FbmsException extends Exception {

    public FbmsException(String message) {
        super(message);
    }


    public FbmsException(String message, Throwable cause) {
        super(message, cause);
    }


    public FbmsException(Throwable cause) {
        super(cause);
    }

}
