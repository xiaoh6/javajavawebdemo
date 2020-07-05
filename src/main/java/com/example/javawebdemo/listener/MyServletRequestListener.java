package com.example.javawebdemo.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletRequestListener implements ServletRequestListener {

    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("request 创建了、、、");
    }

    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("request 销毁了、、、");
    }
}
