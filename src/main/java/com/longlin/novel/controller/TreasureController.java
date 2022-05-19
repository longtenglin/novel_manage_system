package com.longlin.novel.controller;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.service.ITreasureService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:14
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@RestController
@Log4j2
@RequestMapping("web/treasure")
public class TreasureController {

    @Autowired
    ITreasureService iTreasureService;

    @PostMapping("getTreasureList")
    public JSONObject getTreasureList(){
        log.info(this.getClass().getName()+ " - Treasure信息获取逻辑处理开始");
        JSONObject response = iTreasureService.getTreasureList();
        log.info(this.getClass().getName()+ " - Treasure信息获取逻辑处理结束");
        return response;
    }
}
