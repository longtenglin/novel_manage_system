package com.longlin.novel.controller;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.service.INovelService;
import com.longlin.novel.utils.ResponseUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:12
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@RestController
@RequestMapping("/web/novel")
@Slf4j
public class NovelController {

    @Autowired
    private INovelService iNovelService;

    @GetMapping("list")
    public JSONObject list(@RequestBody JSONObject params) {
        log.info(this.getClass().getName() + " - novel信息获取逻辑处理开始");
        JSONObject response = iNovelService.list(params);
        log.info(this.getClass().getName() + " - novel信息获取逻辑处理结束");
        return ResponseUtils.setResponseMessage(response);
    }

    @PostMapping("save")
    public JSONObject save(@RequestBody JSONObject params) {
        log.info(this.getClass().getName() + " - novel信息新增逻辑处理开始");
        JSONObject response = iNovelService.save(params);
        log.info(this.getClass().getName() + " - novel信息新增逻辑处理结束");
        return ResponseUtils.setResponseMessage(response);
    }

    @PostMapping("update")
    public JSONObject update(@RequestBody JSONObject params) {
        log.info(this.getClass().getName() + " - Novel信息更新逻辑处理开始");
        JSONObject response = iNovelService.update(params);
        log.info(this.getClass().getName() + " - Novel信息更新逻辑处理结束");
        return ResponseUtils.setResponseMessage(response);
    }

    @DeleteMapping("delete")
    public JSONObject delete(@RequestBody JSONObject params) {
        log.info(this.getClass().getName() + "- Novel信息删除逻辑开始");
        JSONObject response = iNovelService.deleteFalse(params);
        log.info(this.getClass().getName() + "- Novel信息删除逻辑结束");
        return ResponseUtils.setResponseMessage(response);
    }
}
