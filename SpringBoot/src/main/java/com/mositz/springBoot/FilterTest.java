package com.mositz.springBoot;

import org.springframework.boot.context.embedded.FilterRegistrationBean;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by zhangxingxing on 16/7/4.
 */
@WebFilter("/*")
public class FilterTest implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.err.println(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.err.println(request);
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
