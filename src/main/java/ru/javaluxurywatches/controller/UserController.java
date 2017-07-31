package ru.javaluxurywatches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String profile(Model model) {
        return "profile/user";
    }

    @RequestMapping("/profile/setting")
    public String mainSetting(Model model) {
        return "profile/main";
    }

    @RequestMapping("/profile/account")
    public String accountSetting(Model model) {
        return "profile/account";
    }

    boolean testAddUser() {
        User user = new User();
        user.setLogin("TestUser");
        userService.save(user);
        String login = userService.findByLogin(user.getLogin()).getLogin();
        return login != null && login.equals(user.getLogin());
    }

}
