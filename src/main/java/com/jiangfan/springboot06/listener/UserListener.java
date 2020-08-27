package com.jiangfan.springboot06.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Auther: 江帆
 * @Date: 2020/7/1
 * @Description: com.jiangfan.springboot06.listener
 * @version: 1.0
 */
public class UserListener implements ServletContextListener {
   /**
   *  功能描述: web应用启动
   * @Auther:  江帆
   * @Date:
   * @Description:
   */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("............contextInitialized.............contextInitialized.");
    }

    /**
     * 功能描述:服务器关闭，web项目销毁
     *
     * @Auther: 江帆
     * @Date:
     * @Description:
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("............contextDestroyed.............contextDestroyed");

    }
}
