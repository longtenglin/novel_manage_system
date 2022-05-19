package com.longlin.novel.controller;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.service.IPersonService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:13
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@RestController
//@CrossOrigin
@RequestMapping("web/person")
@Log4j2
public class PersonController {
    @Autowired
    IPersonService iPersonService;

    @PostMapping("getPersonList")
    public JSONObject getPersonList(@RequestBody JSONObject params) throws Exception {
        log.info(this.getClass().getName()+" - 获取人物角色信息逻辑处理开始");
        JSONObject response =  iPersonService.getPersonList(params);
        log.info(this.getClass().getName()+" - 获取人物角色信息逻辑处理结束");
        return response;
    }
}
