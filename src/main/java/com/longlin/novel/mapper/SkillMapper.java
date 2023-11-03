package com.longlin.novel.mapper;

import com.baomidou.mybatisplus.extension.service.IService;
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
public interface SkillMapper extends IService<Skill> {
    @Select("SELECT * FROM skill WHERE deleted = 0 ORDER BY id ASE OFFSET #{param1} LIMIT #{param2}")
    List<Skill> getSkillList(int offset, int limit);

    @Select("SELECT COUNT(id) FROM sect WHERE id = 0")
    int getTotalSkill();
}
