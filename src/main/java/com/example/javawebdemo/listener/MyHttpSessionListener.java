package com.example.javawebdemo.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MyHttpSessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session 创建了、、、");
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session 销毁了、、、");
    }
}
