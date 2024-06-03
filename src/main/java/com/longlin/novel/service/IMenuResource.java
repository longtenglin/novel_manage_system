package com.longlin.novel.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @Description:
 * @Datetime: 2022-11-26 16:58
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
public interface IMenuResource {

    JSONObject listByPagination(int current, int pageSize);

    boolean save();

    boolean update();

    boolean deleteFalse();

    boolean deleteTrue();
}
