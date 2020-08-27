package com.jiangfan.springboot06.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * @Auther: 江帆
 * @Date: 2020/6/26
 * @Description: com.jiangfan.springboot06.config
 * @version: 1.0
 */
@Configuration
public class ViewResolverConfig {

    @Bean
    public ViewResolver myViewResolver() {
        return new MyViewResolver();
    }

    public static class MyViewResolver implements ViewResolver {

        @Nullable
        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {

            return null;
        }
    }
}
