package com.longlin.novel.entity;

import lombok.Data;

/**
 * Description: novel information
 *  For example: DouPoCangQong XuanHuan 2018 TuDou
 * Datetime: 2022-04-12 11:08
 * Author: Mr.ZhaoNan
 * Version: 1.0
 */
@Data
public class Novel {
    private String novelName;
    private String novelType;
    private String publishDate;
    private String author;
}
