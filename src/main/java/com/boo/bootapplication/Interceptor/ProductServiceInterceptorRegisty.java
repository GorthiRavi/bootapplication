package com.boo.bootapplication.Interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class ProductServiceInterceptorRegisty extends WebMvcConfigurerAdapter {

    @Autowired
    ProductInterceptor productInterceptor;

    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(productInterceptor);
    }

}
