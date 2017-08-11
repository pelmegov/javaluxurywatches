package ru.javaluxurywatches.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class UserSupportController {
    @RequestMapping(value = "/profile/support", method = RequestMethod.GET)
    public String support(Model model) {
        return "profile/support/support";
    }
}
