package com.longlin.novel.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.entity.Treasure;
import com.longlin.novel.mapper.TreasureMapper;
import com.longlin.novel.service.ITreasureService;
import com.longlin.novel.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:27
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Service
public class TreasureServiceImpl implements ITreasureService {

    @Autowired
    TreasureMapper treasureMapper;

    @Override
    public JSONObject getTreasureList() {
        List<Treasure> treasureList = treasureMapper.getTreasureList();
        return ResponseUtils.setResponseMessage(treasureList);
    }
}
