package com.example.javawebdemo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "MyServlet02",urlPatterns = "/test02")
public class MyServlet02 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("get attributes from 3 scopes -----");

        //application(ServletContext)
        ServletContext servletContext = req.getServletContext();
        resp.getWriter().println(servletContext.getAttribute("111"));

        //session
        HttpSession session = req.getSession();
        resp.getWriter().println(session.getAttribute("222"));

        //request
        resp.getWriter().println(req.getAttribute("333"));

    }
}
