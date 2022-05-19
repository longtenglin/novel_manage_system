package com.longlin.novel.mapper;

import com.longlin.novel.entity.Novel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:16
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Mapper
public interface NovelMapper {
    @Select("SELECT * FROM novel WHERE deleted = 0 ORDER BY id ASC OFFSET #{param1} LIMIT #{param2}")
    List<Novel> getNovelList(int start, int pageSize);

    @Select("SELECT count(id) FROM novel WHERE deleted = 0")
    int getTotalNovel();
}
