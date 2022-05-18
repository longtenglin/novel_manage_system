package com.longlin.novel.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.entity.Novel;
import com.longlin.novel.mapper.NovelMapper;
import com.longlin.novel.service.INovelService;
import com.longlin.novel.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    public JSONObject getNovelList() {
        List<Novel> novelList = novelMapper.getNovelList();
        return ResponseUtils.setResponseMessage(novelList);
    }
}
