package com.longlin.novel.service.impl;

import com.longlin.novel.entity.Novel;
import com.longlin.novel.mapper.NovelMapper;
import com.longlin.novel.service.INovelService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:23
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Service
public class NovelServiceImpl implements INovelService {
    @Autowired
    NovelMapper novelMapper;

    @Override
    public List<Novel> getNovelList() {
        List<Novel> novelList = novelMapper.getNovelList();
        if (novelList == null || novelList.size() == 0){
            return novelMapper.getNovelList();
        }
        return novelMapper.getNovelList();
    }
}
