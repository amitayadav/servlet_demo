package com.virtualemp.Filters;

import com.virtualemp.dao.SignUp;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/signUp")
public class UsernameFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request= (HttpServletRequest) req;
        String email = request.getParameter("email");
        SignUp signUp = new SignUp();
        if (signUp.isExists(email)) {
           // HttpServletResponse response= (HttpServletResponse) req;
            PrintWriter out = res.getWriter();
            out.println("username already exists");
        } else {
            chain.doFilter(req, res);
        }
    }

    @Override
    public void destroy() {

    }
}
