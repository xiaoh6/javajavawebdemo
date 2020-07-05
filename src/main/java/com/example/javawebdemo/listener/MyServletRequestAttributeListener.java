package com.example.javawebdemo.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {

    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("添加数据、、、");
    }

    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("删除数据、、、");
    }

    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("替换数据、、、");
    }
}
