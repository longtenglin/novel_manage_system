package com.longlin.novel.mapper;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.longlin.novel.entity.MenuResource;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface MenuResourceMapper extends IService<MenuResource> {

    @Results(id = "menuResourceMap", value = {
            @Result(column = "resource_id", property = "resourceId", jdbcType = JdbcType.INTEGER, id = true)
            , @Result(column = "resource_name", property = "resourceName", jdbcType = JdbcType.VARCHAR)
            , @Result(column = "resource_type", property = "resourceType", jdbcType = JdbcType.VARCHAR)
            , @Result(column = "order_index", property = "orderIndex", jdbcType = JdbcType.INTEGER)
            , @Result(column = "menu_path", property = "menuPath", jdbcType = JdbcType.VARCHAR)
            , @Result(column = "menu_icon", property = "menuIcon", jdbcType = JdbcType.VARCHAR)
            , @Result(column = "menu_name", property = "menuName", jdbcType = JdbcType.VARCHAR)
            , @Result(column = "parent_index", property = "parentIndex", jdbcType = JdbcType.INTEGER)
            , @Result(column = "operation_rule", property = "oprationRule", jdbcType = JdbcType.VARCHAR)
            , @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP)
            , @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR)
            , @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP)
            , @Result(column = "updater", property = "updater", jdbcType = JdbcType.VARCHAR)
            , @Result(column = "deleted", property = "deleted", jdbcType = JdbcType.INTEGER)
            , @Result(column = "hide_in_menu", property = "hideInMenu", jdbcType = JdbcType.INTEGER)
    })
    @Select("<script>" +
            "   SELECT * " +
            "   FROM menu_resource" +
            "   WHERE deleted = 0" +
            "   ORDER BY order_index AES" +
            "</script>")
    List<MenuResource> selectMenuResourceList();

    @Insert("INSERT INTO " +
            "   menu_resource(" +
            "       resource_name," +
            "       resource_type, " +
            "       order_index, " +
            "       menu_path, " +
            "       menu_icon, " +
            "       menu_name, " +
            "       parent_index, " +
            "       operation_rule, " +
            "       create_time, " +
            "       create_by, " +
            "       update_time, " +
            "       updater," +
            "       hide_in_menu)" +
            "   VALUES(" +
            "       #{resourceName}," +
            "       #{resourceType}, " +
            "       #{orderIndex}, " +
            "       #{menuPath}, " +
            "       #{menuIcon}, " +
            "       #{menuName}, " +
            "       #{parentIndex}, " +
            "       #{operationRule}, " +
            "       #{createTime}, " +
            "       #{createBy}, " +
            "       #{updateTime}, " +
            "       #{updater}, " +
            "       #{hideInMenu})")
    void insertMenuResource(JSONObject params);

    @Update("UPDATE " +
            "   menu_resource " +
            "SET " +
            "   resource_name = #{resourceName}, " +
            "   resource_type = #{resourceType}, " +
            "   order_index = #{orderIndex}, " +
            "   menu_path = #{menuPath}, " +
            "   menu_icon = #{menuIcon}, " +
            "   menu_name = #{menuName}, " +
            "   parent_index = #{parentIndex}, " +
            "   operation_rule = #{operationRule}, " +
            "   update_time = now(), " +
            "   updater = #{updater}, " +
            "   hide_in_menu = #{hideInMenu} " +
            "WHERE resource_id = #{resourceId}")
    void updateMenuResource(JSONObject params);
}
