package com.longlin.novel.controller;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.service.ISkillService;
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
@RequestMapping("web/skill")
public class SkillController {

    @Autowired
    ISkillService iSkillService;

    @PostMapping("getSkillList")
    public JSONObject getSkillList(@RequestBody JSONObject params){
        log.info(this.getClass().getName()+ " - 获取Skill信息控制层处理开始");
        int current = (int) params.get("current");
        int pageSize = (int) params.get("pageSize");
        int offset = (current - 1)*pageSize;
        JSONObject result = iSkillService.getSkillList(offset, pageSize);
        log.info(this.getClass().getName()+ " - 获取Skill信息控制层处理结束");
        return ResponseUtils.setResponseMessage(result);
    }
}
