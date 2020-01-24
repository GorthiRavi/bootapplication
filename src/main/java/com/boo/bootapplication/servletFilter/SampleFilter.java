package com.boo.bootapplication.servletFilter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class SampleFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("ServletFilter in doFilter Method");
        System.out.println("Remote Host:"+request.getRemoteHost());
        System.out.println("Remote Address:"+request.getRemoteAddr());
        // if we didn't call below method request will not go to controller and client
        chain.doFilter(request, response);
    }

    //when we are shutdown serevr before shutting down destroy method will calls
    @Override
    public void destroy() {
        System.out.println("Destroy method");
    }

    // when we started the server before intializing this method will calls
    @Override
    public void init(FilterConfig filterconfig) throws ServletException {
        System.out.println("Init method");
    }


}
