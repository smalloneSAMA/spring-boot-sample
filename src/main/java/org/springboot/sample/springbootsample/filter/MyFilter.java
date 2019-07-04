package org.springboot.sample.springbootsample.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        System.out.println("过滤器执行");
        filterChain.doFilter(servletRequest,servletResponse);


    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
