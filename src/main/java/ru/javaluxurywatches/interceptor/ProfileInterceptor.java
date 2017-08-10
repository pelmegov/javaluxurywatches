package ru.javaluxurywatches.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import ru.javaluxurywatches.model.user.User;
import ru.javaluxurywatches.service.user.UserDetailService;
import ru.javaluxurywatches.service.user.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ProfileInterceptor extends HandlerInterceptorAdapter {

    private final UserDetailService userDetailService;
    private final UserService userService;

    @Autowired
    public ProfileInterceptor(UserDetailService userDetailService,
                              UserService userService) {
        this.userDetailService = userDetailService;
        this.userService = userService;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) throws Exception {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findByLogin(auth.getName());
        modelAndView.addObject("userDetail", user.getUserDetail());
        super.postHandle(request, response, handler, modelAndView);
    }
}
