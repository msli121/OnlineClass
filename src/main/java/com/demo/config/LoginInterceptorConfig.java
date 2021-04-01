package com.demo.config;

import com.demo.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description 登录拦截器配置
 * 无需权限 /api/v1/pub
 * 需要权限 /api/v1/auth
 * @Author msli
 * @Date 2021/04/01
 */

@Configuration
public class LoginInterceptorConfig implements WebMvcConfigurer {

    @Bean
    LoginInterceptor loginInterceptor(){
        return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor()).addPathPatterns("/api/v1/auth/**")
                .excludePathPatterns("/api/v1/auth/login", "/api/v1/auth/register");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
