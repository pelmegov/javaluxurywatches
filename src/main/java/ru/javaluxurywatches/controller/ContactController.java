package ru.javaluxurywatches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.javaluxurywatches.service.mail.BaseMailService;

@Controller
public class ContactController {

    @Value("${admin.email}")
    private String adminEmail;

    private final BaseMailService mailService;

    @Autowired
    public ContactController(BaseMailService mailService) {
        this.mailService = mailService;
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact() {
        return "contact";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public String sendEmail(Model model,
                            @RequestParam String name,
                            @RequestParam String phone,
                            @RequestParam String email,
                            @RequestParam String message,
                            RedirectAttributes redirectAttributes) {

        String subject = "Contact Form Message Java Luxury Watches";
        String userMessage = "User: " + name + ", Email: " + email + ", Phone: " + phone + "\n" + "Message: " + message;

        try {
            mailService.sendEmail(subject, userMessage, adminEmail, email);
            redirectAttributes.addFlashAttribute("isSended", true);
        } catch (MailException e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("isSended", false);
        }
        return "redirect:/contact";
    }
}
