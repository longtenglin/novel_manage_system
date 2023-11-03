package com.longlin.novel.mapper;

import com.longlin.novel.data.DataConst;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Date: 2023/11/3 12:45
 * @Author: Mr.ZhaoNan
 * @Version: 1.0.0
 */
@SpringBootTest
public class NovelMapperTest {

    @Autowired
    private NovelMapper novelMapper;

    @Test
    void getNovelListTest() {
        novelMapper.getNovelList(5, 5);
    }

    @Test
    void insertNovelTest() {
        int count = novelMapper.insertNovel(DataConst.NEW_NOVEL);
        System.out.println(count);
    }
}
