package com.longlin.novel.service;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Datetime: 2022-05-19 10:24
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@SpringBootTest
public class PersonServiceImplTest {

    @Autowired
    IPersonService iPersonService;

    @Test
    void getPersonList() throws Exception{
        JSONObject object = new JSONObject();
        object.put("current", 1);
        object.put("pageSize", 10);
        System.out.println(iPersonService.getPersonList(object).toJSONString());
    }
}
