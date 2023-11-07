package com.longlin.novel.service;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:19
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
public interface INovelService {

    JSONObject list(JSONObject params);

    JSONObject save(JSONObject params);

    JSONObject update(JSONObject params);

    JSONObject deleteFalse(JSONObject params);
}
