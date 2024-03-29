package com.longlin.novel.controller;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.service.IRoadService;
import com.longlin.novel.utils.ResponseUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:13
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@RestController
@Slf4j
@RequestMapping("web/road")
public class RoadController {

    @Autowired
    IRoadService iRoadService;

    @PostMapping("getRoadList")
    public JSONObject getRoadList(@RequestBody JSONObject params){
        log.info(this.getClass().getName()+" - road信息获取逻辑处理开始");
        JSONObject result = iRoadService.getRoadList(params);
        log.info(this.getClass().getName()+" - road信息获取逻辑处理结束");
        return ResponseUtils.setResponseMessage(result);
    }
}
