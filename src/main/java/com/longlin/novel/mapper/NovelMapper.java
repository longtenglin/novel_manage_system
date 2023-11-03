package com.longlin.novel.mapper;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.longlin.novel.entity.Novel;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:16
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Mapper
public interface NovelMapper extends IService<Novel> {
    @Select("SELECT * FROM novel WHERE deleted = 0 ORDER BY id ASC OFFSET #{param1} LIMIT #{param2}")
    List<Novel> getNovelList(int start, int pageSize);

    @Select("SELECT count(id) FROM novel WHERE deleted = 0")
    int getTotalNovel();

    @Insert("INSERT INTO novel(novel_name, novel_type, novel_author, novel_pub_date, novel_description, creator, create_time, updater, update_time) " +
            "VALUES(#{novelName}, #{novelType}, #{novelAuthor}, #{novelPubDate}, #{novelDescription}, #{creator}, now(), #{updater}, now())")
    int insertNovel(JSONObject params);

    @Update("UPDATE novel " +
            "SET " +
            "   novel_name = #{novelName} " +
            "   novel_type = #{novelType} " +
            "   novel_author = #{novelAuthor}" +
            "   novel_pub_date = #{novelPubDate} " +
            "   novel_description = #{novelDescription}" +
            "   updater = #{updater}" +
            "   update_time = now() " +
            "WHERE " +
            "   id = #{id}" +
            "   AND deleted = 0")
    int updateNovelById(JSONObject params);

    @Update("UPDATE novel" +
            "SET " +
            "   deleted = 1 " +
            "WHERE " +
            "   id = #{id}")
    int deleteForFlag(JSONObject params);

    @Delete("DELETED FORM novel WHERE id = #{id}")
    int delete(JSONObject params);
}
