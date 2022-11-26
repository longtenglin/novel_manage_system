package com.longlin.novel.mapper;

import com.longlin.novel.entity.Treasure;
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
public interface TreasureMapper {
    @Select("SELECT * FROM treasure WHERE deleted = 0 ORDER BY id ASE OFFSET #{param1} LIMIT #{param2}")
    List<Treasure> getTreasureList(int offset, int limit);

    @Select("SELECT COUNT(id) FROM treasure WHERE deleted = 0")
    int getTotalTreasure();
}
