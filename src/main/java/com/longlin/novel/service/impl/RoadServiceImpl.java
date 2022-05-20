package com.longlin.novel.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.entity.Road;
import com.longlin.novel.mapper.RoadMapper;
import com.longlin.novel.service.IRoadService;
import com.longlin.novel.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:25
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Service
public class RoadServiceImpl implements IRoadService {

    @Autowired
    RoadMapper roadMapper;
    @Override
    public JSONObject getRoadList(JSONObject params) {
        JSONObject result = new JSONObject();
        int current = (int) params.get("current");
        int pageSize = (int) params.get("pageSize");
        int start = (current -1 )*pageSize;

        int total = roadMapper.getTotalRoad();
        List<Road> roadList = roadMapper.getRoadList(start, pageSize);

        result.put("total", total);
        result.put("current", current);
        result.put("pageSize", pageSize);
        result.put("dataSource", roadList);
        return result;
    }
}
