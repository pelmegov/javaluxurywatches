package ru.javaluxurywatches.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    private final HandlerInterceptor menuInterceptor;
    private final HandlerInterceptor appInterceptor;
    private final HandlerInterceptor profileInterceptor;

    @Autowired
    public WebMvcConfig(HandlerInterceptor menuInterceptor,
                        HandlerInterceptor appInterceptor,
                        HandlerInterceptor profileInterceptor) {
        this.menuInterceptor = menuInterceptor;
        this.appInterceptor = appInterceptor;
        this.profileInterceptor = profileInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(menuInterceptor);
        registry.addInterceptor(appInterceptor);
        registry.addInterceptor(profileInterceptor).addPathPatterns("/users/profile/**");
    }
}
