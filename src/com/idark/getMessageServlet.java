package com.idark;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class getMessageServlet extends HttpServlet {

    /**
     * 接收处理前台以ajax方式输入的数据
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password =  request.getParameter("password");
        PrintWriter pw = response.getWriter();
        if(username.equals("user") && password.equals("word")){
            pw.write("登陆成功");
        }else{
            pw.write("登陆失败");
        }
        pw.close();
    }
}
