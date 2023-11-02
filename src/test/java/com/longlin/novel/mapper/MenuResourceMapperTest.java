package com.longlin.novel.mapper;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Datetime: 2022-11-10 11:30
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@SpringBootTest
public class MenuResourceMapperTest {

    public static JSONObject params = new JSONObject();

    static {
        params.put("resource_name", "SpringBootTest");
        params.put("resource_type", "Spring");
        params.put("order_index", 1);
        params.put("menu_path", "SpringBootTest");
        params.put("menu_icon", "SpringBootTest");
        params.put("menu_name", "SpringBootTest");
        params.put("parent_index", 1);
        params.put("operation_rule", "SpringBootTest");
        params.put("update_time", "");
        params.put("updater", "SpringBootTest");
        params.put("hide_in_menu", 0);
    }

    @Autowired
    private MenuResourceMapper menuResourceMapper;

    @Test
    void updateTest(){
        menuResourceMapper.updateMenuResource(params);
    }
}
