package com.wil.web;

import com.wil.util.HttpClientUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wil on 2017/10/23.
 */
public class SpiderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String p = req.getParameter("p");
        //p = new String(p.getBytes("ISO8859-1"), "UTF-8");
        String url = "http://www.poi86.com/poi/amap/50284.html";
        String res = HttpClientUtil.httpClientGet(url, "UTF-8");
        System.out.println(res);

    }
}
