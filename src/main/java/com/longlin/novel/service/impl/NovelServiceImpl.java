package com.longlin.novel.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.entity.Novel;
import com.longlin.novel.mapper.NovelMapper;
import com.longlin.novel.service.INovelService;
import com.longlin.novel.utils.ResponseUtils;
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
    public JSONObject getNovelList(JSONObject params) {
        int total = novelMapper.getTotalNovel();
        int pageSize = (int) params.get("pageSize");
        int current = (int) params.get("current");
        int start = (current -1)*pageSize;
        List<Novel> novelList = novelMapper.getNovelList(start, pageSize);
        JSONObject result = new JSONObject();
        result.put("total", total);
        result.put("pageSize", pageSize);
        result.put("current", current);
        result.put("dataSource", novelList);
        return ResponseUtils.setResponseMessage(result);
    }
}
