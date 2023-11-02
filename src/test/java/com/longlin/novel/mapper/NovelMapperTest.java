package com.longlin.novel.mapper;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * @Description:
 * @Datetime: 2022/10/11 11:15
 * @Author: Mr.LongLin
 * @Version: 1.0
 */
@SpringBootTest
public class NovelMapperTest {

    @Autowired
    NovelMapper novelMapper;

    private static final JSONObject novelObject = new JSONObject();
    static {
        novelObject.put("novel_name", "Test01");
        novelObject.put("novel_type", "Test01");
        novelObject.put("novel_author", "Test01");
        novelObject.put("novel_pub_date",new Date());
        novelObject.put("novel_description","Test01");
        novelObject.put("creator","SYS");
        novelObject.put("create_time",new Date());
        novelObject.put("updater","SYS");
        novelObject.put("update_time",new Date());
    }

    @Test
    void insertNovel(){
        novelMapper.insertNovel(novelObject);
    }

    @Test
    void updateNovelById(){
        novelObject.put("novel_name", "updated01");
        novelObject.put("id", "LTLN00002");
        novelMapper.updateNovelById(novelObject);
    }
}
