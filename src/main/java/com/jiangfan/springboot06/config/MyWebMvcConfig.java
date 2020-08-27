package com.jiangfan.springboot06.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: 江帆
 * @Date: 2020/6/27
 * @Description: com.jiangfan.springboot06.config
 * @version: 1.0
 */
//SpringBoot1.5以及之前版本都继承webMvcConfigurationAdapter实现添加自定义拦截器，消息转换、视图解析器等
//SpringBoot2.0 webMvcConfigurationAdapte已经废弃,支持实现WebMvcConfigurer接口（第一选择）和继承WebMvcConfigurationSupport类
@Configuration
//@EnableWebMvc
public class MyWebMvcConfig implements WebMvcConfigurer {
    /**
     * 功能描述:
     *
     * @Auther: 江帆
     * @Date:
     * @Description: 注册 快捷访问资源
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/regist").setViewName("success");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login").setViewName("login");
    }

    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter webMvcConfigurerAdapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {

            }
        };
        return webMvcConfigurerAdapter;
    }

    /**
     * 功能描述:重写注册拦截器方法
     *
     * @Auther: 江帆
     * @Date:
     * @Description: 注册拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        /**
         *  功能描述:注册一个实现了handleInterceptor接口的拦截器
         * @Auther: 江帆
         * @Date:
         * @Description:
         */
        registry.addInterceptor(new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                return true;
            }

            @Override
            public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

            }

            @Override
            public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

            }
        }).addPathPatterns().excludePathPatterns();  //指定URI 和排除 URI
    }
}
