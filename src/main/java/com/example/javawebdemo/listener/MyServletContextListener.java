package com.example.javawebdemo.listener;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext 被创建了、、、");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext 被销毁了、、、");
    }
}
