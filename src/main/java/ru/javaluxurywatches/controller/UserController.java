package ru.javaluxurywatches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javaluxurywatches.model.user.User;
import ru.javaluxurywatches.repository.user.UserRepository;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/")
    public Iterable<User> users() {
        return userRepository.findAll();
    }

    boolean testAddUser() {
        User user = new User();
        user.setLogin("TestUser");
        userRepository.save(user);
        String login = userRepository.findByLogin(user.getLogin()).getLogin();
        return login != null && login.equals(user.getLogin());
    }

}
