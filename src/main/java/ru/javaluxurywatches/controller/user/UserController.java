package ru.javaluxurywatches.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javaluxurywatches.model.user.User;
import ru.javaluxurywatches.service.user.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public Iterable<User> users() {
        return userService.findAll();
    }

    public boolean testAddUser() {
        User user = new User();
        user.setLogin("TestUser");
        userService.save(user);
        String login = userService.findByLogin(user.getLogin()).getLogin();
        return login != null && login.equals(user.getLogin());
    }
}
