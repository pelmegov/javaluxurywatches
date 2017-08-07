package ru.javaluxurywatches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.javaluxurywatches.model.user.User;
import ru.javaluxurywatches.service.user.UserDetailService;
import ru.javaluxurywatches.service.user.UserService;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final UserDetailService userDetailService;

    @Autowired
    public UserController(UserService userService, UserDetailService userDetailService) {
        this.userService = userService;
        this.userDetailService = userDetailService;
    }

    @RequestMapping("/")
    public Iterable<User> users() {
        return userService.findAll();
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profile(Model model) {
        return "profile/user";
    }

    @RequestMapping(value = "/profile/setting", method = RequestMethod.GET)
    public String doMainSetting(Model model) {

        return "profile/main";
    }

    @RequestMapping(value = "/profile/setting", method = RequestMethod.POST)
    public String mainSetting(@Valid @ModelAttribute User user,
                              final BindingResult result,
                              RedirectAttributes redirectAttrs) {
        if (result.hasErrors()) {
            return "redirect:profile/setting";
        }
        userService.save(user);
        return "profile/main";
    }

    @RequestMapping(value = "/profile/account", method = RequestMethod.GET)
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
