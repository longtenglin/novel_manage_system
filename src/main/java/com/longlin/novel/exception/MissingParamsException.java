package com.longlin.novel.exception;

import com.longlin.novel.utils.ResponseCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Description:
 * @Date: 2023/10/26 16:09
 * @Author: NEC-JN-LongTengLin
 * @Version: 1.0.0
 */
@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Missing required params")
public class MissingParamsException extends Exception{
    public String code = ResponseCode.E1001;
    public String field = null;

    public String correct = null;

    protected MissingParamsException() {
        super();
    }

    public MissingParamsException(String message) {
        super(message);
    }

    public MissingParamsException(String message, String requiredField) {
        super(message);
        this.correct = requiredField;
    }

    public MissingParamsException(String message, String field, String requiredField) {
        super(message);
        this.field = field;
        this.correct = requiredField;
    }

    public String getCode() {
        return code;
    }
}
