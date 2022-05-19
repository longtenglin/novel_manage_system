package com.longlin.novel.controller;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.service.INovelService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:12
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@RestController
@RequestMapping("/web/novel")
@Log4j2
public class NovelController {

    @Autowired
    INovelService iNovelService;

    @PostMapping("/getNovelList")
    public JSONObject getNovelList(@RequestBody JSONObject params){
       log.info(this.getClass().getName()+" - novel信息获取逻辑处理开始");
       JSONObject response = iNovelService.getNovelList(params);
       log.info(this.getClass().getName()+" - novel信息获取逻辑处理结束");
       return response;
    }
}
