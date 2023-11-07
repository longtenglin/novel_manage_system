package com.longlin.novel.entity;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Description: For example: XiaoYan 18 YanDi
 * @Datetime: 2022-04-12 11:13
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class Person extends BaseEntity{
    private String id;
    @NotNull(message = "M1001")
    private String personName;
    @NotNull
    private String age;
    @NotNull(message = "M1001")
    private String personAttribute;
    private String personDescription;
    private int deleted;
}
