package ru.javaluxurywatches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.javaluxurywatches.model.user.User;
import ru.javaluxurywatches.service.user.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public Iterable<User> users() {
        return userService.findAll();
    }

    @RequestMapping("/profile")
    public ModelAndView profile() {
        return new ModelAndView("profile/user");
    }

    boolean testAddUser() {
        User user = new User();
        user.setLogin("TestUser");
        userService.save(user);
        String login = userService.findByLogin(user.getLogin()).getLogin();
        return login != null && login.equals(user.getLogin());
    }

}
