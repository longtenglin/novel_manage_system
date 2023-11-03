package com.longlin.novel.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.constant.ResponseConst;
import com.longlin.novel.entity.Novel;
import com.longlin.novel.mapper.NovelMapper;
import com.longlin.novel.service.INovelService;
import com.longlin.novel.utils.ResponseUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:23
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Service
@Slf4j
public class NovelServiceImpl implements INovelService {

    @Autowired
    private NovelMapper novelMapper;

    @Override
    public JSONObject list(JSONObject params) {
        log.info(this.getClass().getName() + " - novel信息获取业务处理开始");
        log.info(this.getClass().getName() + " - novel信息数目获取开始");
        int total = novelMapper.getTotalNovel();
        log.info(this.getClass().getName() + " - novel信息数目获取结束");
        int pageSize = (int) params.get(ResponseConst.PAGE_SIZE);
        int current = (int) params.get(ResponseConst.CURRENT);
        int start = (current - 1) * pageSize;
        List<Novel> novelList = novelMapper.getNovelList(start, pageSize);
        JSONObject result = new JSONObject();
        result.put(ResponseConst.TOTAL, total);
        result.put(ResponseConst.PAGE_SIZE, pageSize);
        result.put(ResponseConst.CURRENT, current);
        result.put(ResponseConst.SOURCE, novelList);
        log.info(this.getClass().getName() + " - novel信息获取业务处理结束");
        return result;
    }

    @Override
    public int save(JSONObject params) {
        log.info(this.getClass().getName() + " - Novel信息添加业务处理开始");
        int count = novelMapper.insertNovel(params);
        log.info(this.getClass().getName() + " - Novel信息添加业务处理结束");
        return count;
    }

    @Override
    public int update(JSONObject params) {
        log.info(this.getClass().getName() + " - Novel信息更新业务处理开始");
        int count = novelMapper.updateNovelById(params);
        log.info(this.getClass().getName() + " - Novel信息更新业务处理结束");
        return count;
    }

    @Override
    public int deleteFalse(JSONObject params) {
        log.info(this.getClass().getName() + " - Novel信息更新业务处理开始");
        int count = novelMapper.deleteForFlag(params);
        log.info(this.getClass().getName() + " - Novel信息更新业务处理结束");
        return count;
    }
}
