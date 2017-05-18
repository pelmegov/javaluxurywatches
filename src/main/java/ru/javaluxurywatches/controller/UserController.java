package ru.javaluxurywatches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.javaluxurywatches.config.ModelAttrConfig;
import ru.javaluxurywatches.model.user.User;
import ru.javaluxurywatches.repository.user.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController extends ModelAttrConfig {

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
