package ru.javaluxurywatches.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {

    @RequestMapping(value = "/authorization")
    public String authorization() {
        return "auth";
    }

    @RequestMapping(value = "/registration")
    public String registration() {
        return "reg";
    }

}
