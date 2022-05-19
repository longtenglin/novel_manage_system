package com.longlin.novel.mapper;

import com.longlin.novel.mapper.PersonMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Datetime: 2022-05-19 16:25
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@SpringBootTest
public class PersonMapperTest {

    @Autowired
    PersonMapper personMapper;

    @Test
    void getPersonList(){
        System.out.println(personMapper.getPersonList(0, 10));
    }

    @Test
    void getTotalPerson(){
        System.out.println(personMapper.getTotalPerson());
    }
}
