package com.longlin.novel.controller;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.constant.RequestConst;
import com.longlin.novel.entity.Person;
import com.longlin.novel.exception.MissingParamsException;
import com.longlin.novel.service.IPersonService;
import com.longlin.novel.utils.ResponseCode;
import com.longlin.novel.utils.ResponseUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:13
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@RestController
//@CrossOrigin
@RequestMapping("web/person")
@Slf4j
public class PersonController {

    @Autowired
    IPersonService iPersonService;

    @GetMapping("list")
    public JSONObject getPersonList(@RequestBody JSONObject params) throws Exception {
        log.info(this.getClass().getName()+" - 获取人物角色信息逻辑处理开始");
        JSONObject response =  iPersonService.getPersonList(params);
        log.info(this.getClass().getName()+" - 获取人物角色信息逻辑处理结束");
        return ResponseUtils.setResponseMessage(response);
    }

    @PostMapping("save")
    public JSONObject save(@RequestBody @Validated Person person) throws Exception {
        log.info(this.getClass().getName() + " - 添加人物角色信息逻辑处理开始");
        boolean success = iPersonService.save(person);
        log.info(this.getClass().getName() + " - 添加人物角色信息逻辑处理结束");
        return ResponseUtils.setResponseMessage(success);
    }

    @PostMapping("update")
    public JSONObject update(@RequestBody @Validated Person person) throws Exception {
        log.info(this.getClass().getName() + " - 更新人物角色信息逻辑处理开始");
        boolean success = iPersonService.update(person);
        log.info(this.getClass().getName() + " - 更新人物角色信息逻辑处理结束");
        return ResponseUtils.setResponseMessage(success);
    }

    @PostMapping("delete")
    public JSONObject deleteFalse(@RequestBody JSONObject params) throws Exception {
        log.info(this.getClass().getName() + " - 删除人物角色信息逻辑处理开始");
        if (params.getString(RequestConst.ID).isEmpty()) {
            throw new MissingParamsException("缺失参数", RequestConst.ID, RequestConst.ID);
        }
        boolean success = iPersonService.deleteFalse(params.getString(RequestConst.ID));
        log.info(this.getClass().getName() + " - 删除人物角色信息逻辑处理结束");
        return ResponseUtils.setResponseMessage(success);
    }

    @DeleteMapping("delete")
    public JSONObject delete(@RequestBody JSONObject params) throws Exception {
        log.info(this.getClass().getName() + " - 删除人物角色信息逻辑处理开始");
        if (params.getString(RequestConst.ID).isEmpty()) {
            throw new MissingParamsException("缺失参数", RequestConst.ID, RequestConst.ID);
        }
        boolean success = iPersonService.delete(params.getString(RequestConst.ID));
        log.info(this.getClass().getName() + " - 删除人物角色信息逻辑处理结束");
        return ResponseUtils.setResponseMessage(success);
    }
}
