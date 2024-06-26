package com.longlin.novel.entity;

import lombok.Data;

/**
 * @Description: TianShanXueLian LingHun HanBing ShengZhangYuXueShanZhiDian
 * @Datetime: 2022-04-12 11:21
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */

@Data
public class Treasure extends BaseEntity{
    String id;
    String treasureName;
    String treasureType;
    String treasureAttribute;
    String description;
}
