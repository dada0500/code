package cn.itcast.travel.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/t2")
public class T2 extends HttpServlet {
    private int n = 0;
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println ("------ t2执行"+n+"了 ------");
        System.out.println (request.getParameter ("tp"));
//        response.sendRedirect ( request.getContextPath () + "/test.html");
        response.getWriter ().write ("响应");
//        request.getRequestDispatcher ("test.html").forward (request,response);
        System.out.println ("------ t2执行"+n+"完成 ------");
        n++;
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
