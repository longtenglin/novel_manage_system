package com.longlin.novel.mapper;

import com.baomidou.mybatisplus.extension.service.IService;
import com.longlin.novel.entity.Weapons;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:18
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Mapper
public interface WeaponsMapper extends IService<Weapons> {
    @Select("SELECT * FROM weapons WHERE deleted = 0 ORDER BY id ASE OFFSET #{param1} LIMIT #{param2}")
    List<Weapons> getWeaponsList(int offset, int limit);

    @Select("SELECT COUNT(id) FROM weapons")
    int getTotalWeapons();
}
