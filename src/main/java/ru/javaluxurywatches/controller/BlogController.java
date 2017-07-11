package ru.javaluxurywatches.controller;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javaluxurywatches.model.blog.Post;
import ru.javaluxurywatches.repository.blog.PostRepository;


@Controller
public class BlogController {

    private interface Attr {
        String POSTS = "posts";
        String POST = "post";
        String CURRENT_PAGE = "currentPage";
        String IS_FIRST_PAGE = "isFirstPage";
        String IS_LAST_PAGE = "isLastPage";
    }

    private final PostRepository postService;

    @Autowired
    public BlogController(PostRepository postService) {
        this.postService = postService;
    }

    @RequestMapping("/blog")
    public String pages(Model model, Pageable pageable) {
        Page<Post> posts = postService.findByIsActive(true, pageable);
        model.addAttribute(Attr.POSTS, posts.getContent());
        model.addAttribute(Attr.CURRENT_PAGE, pageable.getPageNumber());
        model.addAttribute(Attr.IS_FIRST_PAGE, posts.isFirst());
        model.addAttribute(Attr.IS_LAST_PAGE, posts.isLast());
        return "blog/posts";
    }

    @RequestMapping("/blog/{link}")
    public String page(@NonNull @PathVariable("link") String link, Model model) {
        model.addAttribute(Attr.POST, postService.findByLinkAndIsActive(link, true));
        return "blog/post";
    }

}
