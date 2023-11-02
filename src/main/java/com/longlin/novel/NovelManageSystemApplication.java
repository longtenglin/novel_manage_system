package com.longlin.novel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description:
 * @Datetime: 2022-04-12 11:02
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */

@SpringBootApplication
public class NovelManageSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(NovelManageSystemApplication.class, args);
    }
}
