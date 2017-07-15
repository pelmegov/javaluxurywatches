package ru.javaluxurywatches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javaluxurywatches.service.blog.PostService;
import ru.javaluxurywatches.service.shop.ItemService;

@Controller
public class BaseController {

    private interface Attr {
        String WELCOME_MESSAGE = "welcome";
        String POSTS = "posts";
        String INDEX_ITEMS = "indexItems";
        String INDEX_HITS = "indexHits";
    }

    @Value("${index.items}")
    private Integer indexItems;

    private final PostService postService;
    private final ItemService itemService;

    @Autowired
    public BaseController(PostService postService, ItemService itemService) {
        this.postService = postService;
        this.itemService = itemService;
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute(Attr.WELCOME_MESSAGE, "Welcome in Java Luxury Watches Shop!");
        model.addAttribute(Attr.INDEX_ITEMS, itemService.findForIndex(indexItems));
        model.addAttribute(Attr.INDEX_HITS, itemService.findHitsForIndex());
        model.addAttribute(Attr.POSTS, postService.findByIsSlider(true));
        return "index";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    boolean testMethod() {
        return true;
    }

}
