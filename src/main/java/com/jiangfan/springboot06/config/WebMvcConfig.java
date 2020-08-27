package com.jiangfan.springboot06.config;

import com.jiangfan.springboot06.filter.UserFilter;
import com.jiangfan.springboot06.listener.UserListener;
import com.jiangfan.springboot06.servlet.UserServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @Auther: 江帆
 * @Date: 2020/7/1
 * @Description: com.jiangfan.springboot06.config
 * @version: 1.0
 */
@Configuration
public class WebMvcConfig {
    @Bean
    public ServletRegistrationBean myServlet() {
        //参数1  自定义servlet  参数2  该servlet访问路径
        return new ServletRegistrationBean(new UserServlet(), "/userServlet");
    }

    ;

    @Bean
    public FilterRegistrationBean myFilter() {
        //创建filterRegistrationBean实例
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new UserFilter());  //设置过滤器
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/hello", "/userServlet")); //设置过滤的URL
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new UserListener());
        return servletListenerRegistrationBean;
    }
}


