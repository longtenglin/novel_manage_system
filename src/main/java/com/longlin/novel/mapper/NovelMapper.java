package com.longlin.novel.mapper;

import com.longlin.novel.entity.Novel;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.sql.Date;
import java.util.List;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:16
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Mapper
public interface NovelMapper {

    @Results(id = "novelMap", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true)
            , @Result(column = "novel_name", property = "novelName", jdbcType = JdbcType.VARCHAR)
            , @Result(column = "novel_type", property = "novelType", jdbcType = JdbcType.VARCHAR)
            , @Result(column = "novel_author", property = "novelAuthor", jdbcType = JdbcType.VARCHAR)
            , @Result(column = "novel_pubdate", property = "novelPubDate", jdbcType = JdbcType.TIMESTAMP)
            , @Result(column = "novel_description", property = "novelDescription", jdbcType = JdbcType.VARCHAR)
            , @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP)
            , @Result(column = "creator", property = "creator", jdbcType = JdbcType.VARCHAR)
            , @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP)
            , @Result(column = "updater", property = "updater", jdbcType = JdbcType.VARCHAR)
            , @Result(column = "deleted", property = "deleted", jdbcType = JdbcType.INTEGER)
    })
    @Select("SELECT * FROM novel WHERE deleted = 0 ORDER BY id ASC OFFSET #{param1} LIMIT #{param2}")
    List<Novel> getNovelList(int start, int pageSize);

    @Select("SELECT count(id) FROM novel WHERE deleted = 0")
    int getTotalNovel();
}
