package com.longlin.novel.entity;

import lombok.Data;

/**
 * @Description: MingWangZou Fo FoJiaoDeGongFa
 * @Datetime: 2022-04-12 11:18
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Data
public class Skill extends BaseEntity{
    String id;
    String skillName;
    String skillType;
    String skillAttribute;
    String description;
}
