package ru.javaluxurywatches.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import ru.javaluxurywatches.model.user.User;
import ru.javaluxurywatches.service.user.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AppInterceptor extends HandlerInterceptorAdapter {

    private UserService userService;

    @Autowired
    public AppInterceptor(UserService userService) {
        this.userService = userService;
    }

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
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            User user = null;
            if (auth.getPrincipal() != "anonymousUser") {
                user = userService.findByLogin(auth.getName());
            }
            modelAndView.addObject("user", user);
            super.postHandle(request, response, handler, modelAndView);
        }
    }
}
