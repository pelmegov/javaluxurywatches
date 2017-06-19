package ru.javaluxurywatches.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import ru.javaluxurywatches.repository.shop.CategoryRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MenuInterceptor extends HandlerInterceptorAdapter {

    private final CategoryRepository categoryRepository;

    @Autowired
    public MenuInterceptor(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        modelAndView.addObject("categories", categoryRepository.findAll());
        super.postHandle(request, response, handler, modelAndView);
    }
}
