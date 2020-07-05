package com.example.javawebdemo.listener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/test03")
public class MyServlet03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("111","111");
        System.out.println("MyServlet03: set 111:111");

        req.setAttribute("222","222");
        System.out.println("MyServlet03: set 222:222");

        req.removeAttribute("111");
        System.out.println("MyServlet03: remove 222");

        req.setAttribute("111","222");
        System.out.println("MyServlet03: set 111:222");
    }
}
