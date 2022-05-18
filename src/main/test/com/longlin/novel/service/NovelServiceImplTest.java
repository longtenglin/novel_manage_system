package com.longlin.novel.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Datetime: 2022/4/20 20:56
 * @Author: Mr.LongLin
 * @Version: 1.0
 */
@SpringBootTest
public class NovelServiceImplTest {

    @Autowired
    INovelService iNovelService;

    @Test
    public void getNovelList(){
        System.out.println(iNovelService.getNovelList().toJSONString());
    }
}
