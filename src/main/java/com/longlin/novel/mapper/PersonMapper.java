package com.longlin.novel.mapper;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.entity.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:17
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Mapper
public interface PersonMapper {

    @Select("SELECT * FROM person WHERE deleted = 0 ORDER BY id ASC OFFSET #{param1} LIMIT #{param2}")
    List<Person> getPersonList(int start, int pageSize);

    @Select("SELECT COUNT(id) FROM person WHERE deleted = 0")
    int getTotalPerson();

    @Insert("INSERT INTO " +
            "   person " +
            "       (   person_name, " +
            "           age, " +
            "           person_attribute, " +
            "           person_description, " +
            "           create_time, " +
            "           creator, " +
            "           update_time, " +
            "           updater, " +
            "       )" +
            "   VALUES" +
            "       (   #{person_name}," +
            "           #{age}, " +
            "           #{person_attribute}, " +
            "           #{person_description}, " +
            "           now() , " +
            "           #{creator}, " +
            "           now(), " +
            "           #{updater}" +
            "       )")
    void insertPerson(JSONObject params);
}
