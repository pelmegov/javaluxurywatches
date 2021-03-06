package ru.javaluxurywatches.interceptor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AppInterceptor extends HandlerInterceptorAdapter {

    @Value("${blog.page-size}")
    private Integer blogPageSize;

    @Value("${category.page-size}")
    private Integer categoryPageSize;

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        if (modelAndView != null) {
            modelAndView.addObject("blogPageSize", blogPageSize);
            modelAndView.addObject("categoryPageSize", categoryPageSize);
            super.postHandle(request, response, handler, modelAndView);
        }
    }

}
