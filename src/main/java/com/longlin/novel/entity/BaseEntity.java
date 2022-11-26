package com.longlin.novel.entity;

import lombok.Data;

import java.sql.Date;

/**
 * @Description:
 * @Datetime: 2022-11-26 17:00
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Data
public class BaseEntity {
    private Date createTime;
    private String creator;
    private Date updateTime;
    private String updater;
    private int deleted;
}
