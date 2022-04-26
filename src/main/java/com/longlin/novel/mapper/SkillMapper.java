package com.longlin.novel.mapper;

import com.longlin.novel.entity.Skill;
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
public interface SkillMapper {
    @Select("SELECT * FROM skill")
    List<Skill> getSkillList();
}
