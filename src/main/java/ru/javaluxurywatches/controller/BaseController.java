package ru.javaluxurywatches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javaluxurywatches.service.blog.PostService;
import ru.javaluxurywatches.service.shop.ProductService;

@Controller
public class BaseController {

    private interface Attr {
        String WELCOME_MESSAGE = "welcome";
        String POSTS = "posts";
        String INDEX_PRODUCTS = "indexProducts";
        String INDEX_HITS = "indexHits";
    }

    @Value("${index.products}")
    private Integer indexProducts;

    private final PostService postService;
    private final ProductService productService;

    @Autowired
    public BaseController(PostService postService, ProductService productService) {
        this.postService = postService;
        this.productService = productService;
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute(Attr.WELCOME_MESSAGE, "Welcome in Java Luxury Watches Shop!");
        model.addAttribute(Attr.INDEX_PRODUCTS, productService.findForIndex(indexProducts));
        model.addAttribute(Attr.INDEX_HITS, productService.findHitsForIndex());
        model.addAttribute(Attr.POSTS, postService.findByIsSlider(true));
        return "index";
    }

    boolean testMethod() {
        return true;
    }

}
