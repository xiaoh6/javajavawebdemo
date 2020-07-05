package com.example.javawebdemo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "MyServlet01",urlPatterns = "/test01")
public class MyServlet01 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // application
        System.out.println("Servlet name is "+this.getServletName());
        ServletContext servletContext = req.getServletContext();
        servletContext.setAttribute("111","1111");

        //session
        HttpSession session = req.getSession();
        session.setAttribute("222","2222");

        //request
        req.setAttribute("333","3333");

        resp.getWriter().println("set scope attributes  -----");
        System.out.println(this.getServletName()+"做出响应、、、");
    }
}

