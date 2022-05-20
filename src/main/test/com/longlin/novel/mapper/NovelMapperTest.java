package com.longlin.novel.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Datetime: 2022-05-20 10:16
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@SpringBootTest
public class NovelMapperTest {

    @Autowired
    NovelMapper novelMapper;

    @Test
    void getNovelList(){
        System.out.println(novelMapper.getNovelList(0, 10));
    }

    @Test
    void getTotalNovel(){
        System.out.println(novelMapper.getTotalNovel());
    }
}
