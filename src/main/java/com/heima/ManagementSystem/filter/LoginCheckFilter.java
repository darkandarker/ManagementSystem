package com.heima.ManagementSystem.filter;


import com.alibaba.fastjson.JSONObject;
import com.heima.ManagementSystem.pojo.Result;
import com.heima.ManagementSystem.utils.JwtUtils;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class LoginCheckFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        String url = req.getRequestURL().toString();

        if(url.contains("login")){
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }

        String jwt = req.getHeader("token");

        if(!StringUtils.hasLength(jwt)){
            Result error = Result.error("NOT LOGIN");

            String notLogin = JSONObject.toJSONString(error);
            resp.getWriter().write(notLogin);

            return;
        }

        try {
            JwtUtils.parseJWT(jwt);
        } catch (Exception e) {
            e.printStackTrace();
            Result error = Result.error("NOT LOGIN");


            String notLogin = JSONObject.toJSONString(error);
            resp.getWriter().write(notLogin);
            return;
        }

        filterChain.doFilter(servletRequest,servletResponse);
    }
}
