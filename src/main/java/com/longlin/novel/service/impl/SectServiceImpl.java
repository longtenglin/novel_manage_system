package com.longlin.novel.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.entity.Sect;
import com.longlin.novel.mapper.SectMapper;
import com.longlin.novel.service.ISectService;
import com.longlin.novel.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:26
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Service
public class SectServiceImpl implements ISectService {

    @Autowired
    SectMapper sectMapper;
    @Override
    public JSONObject getSectList(JSONObject params) {
        JSONObject result = new JSONObject();
        int current = (int) params.get("current");
        int pageSize = (int) params.get("pageSize");
        int offset = (current - 1)*pageSize;
        int total = sectMapper.getTotalSect();
        List<Sect> sectList = sectMapper.getSectList(offset, pageSize);

        result.put("total", total);
        result.put("current", current);
        result.put("pageSize", pageSize);
        result.put("dataSource", sectList);
        return result;
    }
}
