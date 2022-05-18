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
    public JSONObject getSectList() {
        List<Sect> sectList = sectMapper.getSectList();
        return ResponseUtils.setResponseMessage(sectList);
    }
}
