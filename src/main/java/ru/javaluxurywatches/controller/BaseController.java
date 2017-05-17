package ru.javaluxurywatches.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class BaseController extends ModelAttr {

    public static final String WELCOME_MESSAGE = "welcome";

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put(WELCOME_MESSAGE, "Welcome in Java Luxury Watches Shop!");
        return "index";
    }

    boolean testMethod() {
        return true;
    }

}
