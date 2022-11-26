package com.longlin.novel.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:21
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
public interface ISkillService {
    JSONObject getSkillList(int offset, int limit);
}
