package com.longlin.novel.mapper;

import com.longlin.novel.entity.Novel;
import org.apache.ibatis.annotations.Mapper;
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
    @Select("SELETC * FROM novel")
    List<Novel> getNovelList();
}
