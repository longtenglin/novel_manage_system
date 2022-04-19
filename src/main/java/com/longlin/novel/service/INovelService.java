package com.longlin.novel.service;

import com.longlin.novel.entity.Novel;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:19
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
public interface INovelService {
    List<Novel> getNovelList();
}
