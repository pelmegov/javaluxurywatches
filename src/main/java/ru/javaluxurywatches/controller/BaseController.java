package ru.javaluxurywatches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javaluxurywatches.config.ModelAttrConfig;
import ru.javaluxurywatches.repository.blog.PostRepository;

import java.util.Map;

@Controller
public class BaseController extends ModelAttrConfig {

    public static final String WELCOME_MESSAGE = "welcome";
    public static final String POSTS = "posts";

    private final PostRepository postRepository;

    @Autowired
    public BaseController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put(WELCOME_MESSAGE, "Welcome in Java Luxury Watches Shop!");
        model.put(POSTS, postRepository.findByIsSlider(true));
        return "index";
    }

    @RequestMapping("/contact")
    public String contact(Map<String, Object> model) {
        return "contact";
    }

    boolean testMethod() {
        return true;
    }

}
