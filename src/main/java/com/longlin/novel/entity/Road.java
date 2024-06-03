package com.longlin.novel.entity;

import lombok.Data;

/**
 * @Description: HunXiu LingHun
 * @Datetime: 2022-04-12 11:30
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */

@Data
public class Road extends BaseEntity{
    String id;
    String roadName;
    String roadType;
    String roadAttribute;
    String description;
}
