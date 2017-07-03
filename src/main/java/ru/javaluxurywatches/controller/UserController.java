package ru.javaluxurywatches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javaluxurywatches.model.user.User;
import ru.javaluxurywatches.repository.user.UserRepository;
import ru.javaluxurywatches.services.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

//    private final UserRepository userRepository;

    @Autowired
    private UserService userService;

//    @Autowired
//    public UserController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    @RequestMapping("/")
    public Iterable<User> users() {
        return userService.getAll();
    }

    boolean testAddUser() {
        User user = new User();
        user.setLogin("TestUser");
        userService.saveUser(user);
        String login = userService.getByLogin(user.getLogin()).getLogin();
        return login != null && login.equals(user.getLogin());
    }

}
