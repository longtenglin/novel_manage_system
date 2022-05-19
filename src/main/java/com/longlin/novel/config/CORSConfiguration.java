package com.longlin.novel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Description:
 * @Datetime: 2022-05-19 10:33
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Configuration
public class CORSConfiguration {

    @Bean
    public CorsFilter corsFilter(){
        CorsConfiguration configuration = new CorsConfiguration();
//        configuration.addAllowedOrigin("*");  // 设置为 * 失败
//        configuration.addAllowedOrigin("http://localhost:3000"); // 设置具体访问源成功
        configuration.addAllowedOriginPattern("*"); // 设置为 * 成功。 网上有人说，是因为 springboot 版本过高岛主
        configuration.setAllowCredentials(true);
        configuration.addAllowedHeader("*");
        configuration.addAllowedMethod("*");
        configuration.addExposedHeader("*");

        UrlBasedCorsConfigurationSource corsConfigurationSource = new UrlBasedCorsConfigurationSource();
        corsConfigurationSource.registerCorsConfiguration("/**", configuration);
        return new CorsFilter(corsConfigurationSource);
    }
}
