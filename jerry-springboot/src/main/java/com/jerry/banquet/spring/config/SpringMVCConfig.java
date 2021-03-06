package com.jerry.banquet.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.jerry.banquet.interceptors.UserLoginHandlerInterceptor;

/**
 * mvc 拦截器
 * 
 * @author Jerry
 *
 */
@Configuration
public class SpringMVCConfig extends WebMvcConfigurerAdapter {
    
    @Autowired
    private UserLoginHandlerInterceptor userLoginHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 判断用户是否登录的拦截器
        registry.addInterceptor(userLoginHandlerInterceptor).addPathPatterns("/banquet/**");
    }
}

