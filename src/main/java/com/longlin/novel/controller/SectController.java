package com.longlin.novel.controller;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.service.ISectService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:13
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@RestController
@Log4j2
@RequestMapping("web/sect")
public class SectController {

    @Autowired
    ISectService iSectService;

    @PostMapping("getSectList")
    public JSONObject getSectList(){
        log.info(this.getClass().getName()+" - Sect信息获取逻辑处理开始");
        JSONObject response = iSectService.getSectList();
        log.info(this.getClass().getName()+ " - Sect信息获取逻辑处理结束");
        return response;
    }
}
