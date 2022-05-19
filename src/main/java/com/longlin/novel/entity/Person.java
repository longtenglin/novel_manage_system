package com.longlin.novel.entity;

import lombok.Data;

/**
 * @Description: For example: XiaoYan 18 YanDi
 * @Datetime: 2022-04-12 11:13
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */

@Data
public class Person {
    private String personName;
    private String age;
    private String personAttribute;
    private String description;
    private int isDeleted;
}
