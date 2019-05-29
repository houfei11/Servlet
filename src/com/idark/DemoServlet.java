package com.idark;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "DemoServlet", urlPatterns = "/myFirstServlet")
@WebServlet(name = "myFirstServlet")
public class DemoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.print("Hello, This is my First servlet");
        /**
         * 1.使用页面跳转的方式，更改页面的url
         */
        response.sendRedirect("getMessage.jsp");
        /**
         * 2.使用页面返回的方式，加载web文件夹中的.jsp文件中的内容，将内容返回出去，url不变（推荐方法）
         */
        request.getRequestDispatcher("/getMessage.jsp").forward(request, response);
        /**
         * 3.通过调用IO流的方式，将网页信息写出去
         */
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.write("<!DOCTYPEhtml>");
        pw.write("<html>");
        pw.write("<head>");
        pw.write("<title>");
        pw.write("index");
        pw.write("</title>");
        pw.write("</head>");
        pw.write("<body>");
        pw.write("index");
        pw.write("</body>");
        pw.write("</html>");
    }
}
