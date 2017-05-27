package ru.javaluxurywatches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javaluxurywatches.config.ModelAttrConfig;
import ru.javaluxurywatches.repository.blog.PostRepository;

@Controller
public class BlogController extends ModelAttrConfig {

    public static final String POSTS = "posts";

    private final PostRepository postRepository;

    @Autowired
    public BlogController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @RequestMapping("/blog")
    public String blog(Model model) {
        model.addAttribute(POSTS, postRepository.findByIsActive(true));
        return "blog";
    }

}
