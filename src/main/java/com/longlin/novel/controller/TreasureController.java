package com.longlin.novel.controller;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.service.ITreasureService;
import com.longlin.novel.utils.ResponseUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:14
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@RestController
@Slf4j
@RequestMapping("web/treasure")
public class TreasureController {

    @Autowired
    ITreasureService iTreasureService;

    @PostMapping("getTreasureList")
    public JSONObject getTreasureList(@RequestBody JSONObject params){
        log.info(this.getClass().getName()+ " - Treasure信息获取逻辑处理开始");
        int current = (int) params.get("current");
        int pageSize = (int) params.get("pageSize");
        int offset = (current - 1)*pageSize;
        JSONObject result = iTreasureService.getTreasureList(offset, pageSize);
        log.info(this.getClass().getName()+ " - Treasure信息获取逻辑处理结束");
        return ResponseUtils.setResponseMessage(result);
    }
}
