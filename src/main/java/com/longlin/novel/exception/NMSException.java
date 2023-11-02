package com.longlin.novel.exception;

import com.longlin.novel.utils.ResponseCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Description:
 * @Date: 2023/10/26 15:56
 * @Author: Mr.ZhaoNan
 * @Version: 1.0.0
 */
@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Server Internal Exception")
public class NMSException extends Exception{

    private String code = null;

    protected NMSException(){
        super();
    }

    public NMSException(String message) {
        super(message);
        this.code = ResponseCode.E9999;
    }

    public NMSException(String code, String message) {
        super(message);
        this.code = code;
    }

    public NMSException(String message, Throwable throwable) {
        super(message, throwable);
        this.code = ResponseCode.E9999;
    }

    public String getCode() {
        return code;
    }

}
