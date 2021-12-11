package com.example.servlet.e_cachedfactory.servlet;

import com.example.servlet.e_cachedfactory.service.DemoService;
import com.example.servlet.e_cachedfactory.service.impl.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/demoServlet5")
public class DemoServlet extends HttpServlet {

    private DemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> list = demoService.findAll();
        resp.getWriter().println(list.toString());
    }
}
