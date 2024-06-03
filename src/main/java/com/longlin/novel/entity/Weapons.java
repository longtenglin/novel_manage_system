package com.longlin.novel.entity;

import lombok.Data;

/**
 * @Description: DuanTianDao Dao Huo RuQiMingKeDuanTian
 * @Datetime: 2022-04-12 11:26
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */

@Data
public class Weapons extends BaseEntity{
    String id;
    String weaponsName;
    String weaponsType;
    String weaponsAttribute;
    String description;
}
