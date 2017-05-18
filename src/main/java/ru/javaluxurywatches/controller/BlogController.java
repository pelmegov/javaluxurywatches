package ru.javaluxurywatches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javaluxurywatches.config.ModelAttrConfig;
import ru.javaluxurywatches.repository.blog.PostRepository;

import java.util.Map;

@Controller
public class BlogController extends ModelAttrConfig {

    public static final String POSTS = "posts";

    private final PostRepository postRepository;

    @Autowired
    public BlogController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @RequestMapping("/blog")
    public String blog(Pageable pageable, Map<String, Object> model) {
        model.put(POSTS, postRepository.findByIsActive(true));
        return "blog";
    }

}
