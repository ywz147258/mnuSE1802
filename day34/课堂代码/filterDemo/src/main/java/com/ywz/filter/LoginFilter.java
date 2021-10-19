package com.ywz.filter;

import com.sun.deploy.net.HttpResponse;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        //判断session是否存在
        if(request.getSession().getAttribute("isLogin")==null){
            HttpServletResponse resonse= (HttpServletResponse) servletResponse;
            resonse.sendRedirect("/filterDemo_war/index.jsp");
        }
        //保持原有的请求路径,如果不执行这一段，就无法完成完整请求
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
