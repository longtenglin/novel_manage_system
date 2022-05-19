package com.longlin.novel.controller;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.controller.NovelController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Datetime: 2022/5/19 20:01
 * @Author: Mr.LongLin
 * @Version: 1.0
 */
@SpringBootTest
public class NovelControllerTest {

    @Autowired
    NovelController novelController;

    @Test
    void getNovelList(){
        JSONObject object = new JSONObject();
        object.put("current", 1);
        object.put("pageSize", 10);
        System.out.println(novelController.getNovelList(object));
    }
}
