package com.longlin.novel.controller;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Datetime: 2022-05-19 10:30
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@SpringBootTest
public class PersonControllerTest {

    @Autowired
    PersonController personController;

    @Test
    void getPersonList() throws Exception {
        JSONObject object = new JSONObject();
        object.put("current", 1);
        object.put("pageSize", 10);
        System.out.println(personController.getPersonList(object));
    }
}
