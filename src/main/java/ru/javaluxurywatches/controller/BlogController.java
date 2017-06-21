package ru.javaluxurywatches.controller;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javaluxurywatches.repository.blog.PostRepository;

@Controller
public class BlogController {

    private interface Attr {
        String POSTS = "posts";
        String POST = "post";
    }

    private final PostRepository postRepository;

    @Autowired
    public BlogController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @RequestMapping("/blog")
    public String pages(Model model) {
        model.addAttribute(Attr.POSTS, postRepository.findByIsActive(true));
        return "blog/posts";
    }

    @RequestMapping("/blog/{link}")
    public String page(@NonNull @PathVariable("link") String link, Model model) {
        model.addAttribute(Attr.POST, postRepository.findByLinkAndIsActive(link, true));
        return "blog/post";
    }

}
