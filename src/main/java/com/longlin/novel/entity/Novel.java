package com.longlin.novel.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.sql.Date;

/**
 * Description: novel information
 *  For example: DouPoCangQong XuanHuan 2018 TuDou
 * Datetime: 2022-04-12 11:08
 * Author: Mr.ZhaoNan
 * Version: 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "novel")
public class Novel extends BaseEntity{
    private String id;
    private String novelName;
    private String novelType;
    private String novelAuthor;
    private Date novelPubDate;
    private String novelDescription;
}
