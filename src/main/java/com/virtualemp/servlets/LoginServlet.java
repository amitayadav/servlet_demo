package com.virtualemp.servlets;

import com.virtualemp.dao.LoginDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //User user = (User) request.getAttribute("user"); #RequestDispatcher
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");
        String psw = request.getParameter("psw");
        LoginDao dao= new LoginDao();
        if(dao.check(uname,psw)){

        //if(uname.equals("abc@gmail.com") && psw.equals("abc")) {
           HttpSession sess = request.getSession();
           sess.setAttribute("username",uname);
           response.sendRedirect("welcome.jsp");
        }else {
            response.sendRedirect("signin.jsp");
        }
    }
}