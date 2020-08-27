package com.jiangfan.springboot06.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Auther: 江帆
 * @Date: 2020/7/1
 * @Description: com.jiangfan.springboot06.filter
 * @version: 1.0
 */
public class UserFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("user ...filter...........");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
