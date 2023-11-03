package com.longlin.novel.mapper;

import com.baomidou.mybatisplus.extension.service.IService;
import com.longlin.novel.entity.Sect;
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
public interface SectMapper extends IService<Sect> {
    @Select("SELECT * FROM sect WHERE deleted = 0 ORDER BY id ASE OFFSET #{offset} LIMIT #{limit}")
    List<Sect> getSectList(int offset, int limit);

    @Select("SELECT COUNT(id) FROM sect WHERE deleted = 0")
    int getTotalSect();
}
