package com.virtualemp.servlets;

import com.virtualemp.dao.SignUp;
import com.virtualemp.models.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SignUpServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String email = request.getParameter("email");
        String password = request.getParameter("psw");
        SignUp signUp = new SignUp();
        User user = new User(email, password);
        if (signUp.insert(user)) {
            response.sendRedirect("signin.jsp");
        }

            /*RequestDispatcher rd = request.getRequestDispatcher("login");
            request.setAttribute("user",user);
            rd.forward(request, response);*/
        else {

            response.sendRedirect("signup.jsp");
        }
    }
}
