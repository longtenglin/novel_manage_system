package com.longlin.novel.mapper;

import com.longlin.novel.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:17
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Mapper
public interface PersonMapper {
    @Select("SELECT * FROM person")
    List<Person> getPersonList();
}
