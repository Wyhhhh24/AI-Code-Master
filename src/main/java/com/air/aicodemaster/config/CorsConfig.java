package com.air.aicodemaster.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 全局跨域配置类
 * 跨域是指浏览؜器访问的 URL（前端地址）和后端接口地址的‌域名（或端口号）不一致导致的，浏览器为了安全‍，默认禁止跨域请求访问。
 * 假设前端：http://localhost:5173/
 * 后端接口：http://localhost:8123/api
 * 这就是跨域！
 * 为了开发调؜试方便，我们可以通过全局跨域配置，让‌整个项目所有的接口支持跨域，解决‍跨域报错。
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 覆盖所有请求
        registry.addMapping("/**")
                // 允许发送 Cookie
                .allowCredentials(true)
                // 放行哪些域名（必须用 patterns，否则 * 会和 allowCredentials 冲突）
                .allowedOriginPatterns("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .exposedHeaders("*");
    }
}
