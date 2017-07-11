package ru.javaluxurywatches.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import ru.javaluxurywatches.service.shop.CategoryService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MenuInterceptor extends HandlerInterceptorAdapter {

    private final CategoryService categoryService;

    @Autowired
    public MenuInterceptor(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        if (modelAndView != null) {
            modelAndView.addObject("categories", categoryService.findAll());
            super.postHandle(request, response, handler, modelAndView);
        }
    }
}
