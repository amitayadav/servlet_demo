package com.virtualemp.Filters;

import com.virtualemp.dao.SignUp;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/signUp")
public class ConfirmPasswordFilter implements  Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request= (HttpServletRequest) req;
        String password = request.getParameter("psw");
        String conPassword = request.getParameter("psw-repeat");

        if (password.equals(conPassword)) {
            chain.doFilter(req, res);
        } else {
            PrintWriter out = res.getWriter();
            out.println("password and confirm password doesn't match");
        }
    }

    @Override
    public void destroy() {

    }
}
