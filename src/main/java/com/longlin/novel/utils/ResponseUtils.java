package com.longlin.novel.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2022/4/21 20:07
 * @Author: Mr.LongLin
 * @Version: 1.0
 */
@Configuration
public class ResponseUtils {
    public static JSONObject setResponseMessage(Object object){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", ResponseCode.E0000);
        jsonObject.put("message", ResponseMessage.E0000);
        jsonObject.put("result", object);
        return jsonObject;
    }
}
