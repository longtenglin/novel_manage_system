package com.longlin.novel.mapper;

import com.longlin.novel.entity.Road;
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
public interface RoadMapper {
    @Select("SELECT * FROM road")
    List<Road> getRoadList();
}
