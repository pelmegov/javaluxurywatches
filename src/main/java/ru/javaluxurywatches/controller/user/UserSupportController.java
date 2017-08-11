package ru.javaluxurywatches.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.javaluxurywatches.model.user.User;
import ru.javaluxurywatches.service.user.UserService;

@Controller
@RequestMapping("/users")
public class UserSupportController {

    private final UserService userService;

    @Autowired
    public UserSupportController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/profile/support/", method = RequestMethod.GET)
    public String support(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findByLogin(auth.getName());

        return "profile/support/support";
    }
}
