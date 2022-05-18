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
    public JSONObject getRoadList() {
        List<Road> roadList = roadMapper.getRoadList();
        return ResponseUtils.setResponseMessage(roadList);
    }
}
