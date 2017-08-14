package ru.javaluxurywatches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.javaluxurywatches.model.form.ContactForm;
import ru.javaluxurywatches.service.mail.BaseMailService;

import javax.validation.Valid;

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
    public String contact(Model model, ContactForm contactForm) {
        model.addAttribute("contactForm", contactForm);
        return "contact";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public String sendEmail(@Valid ContactForm contactForm,
                            BindingResult bindingResult,
                            RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            System.out.println("Errors in contact form: " + bindingResult.getAllErrors());
            return "/contact";
        }

        String subject = "Contact Form Message Java Luxury Watches";
        String userMessage = "User: " + contactForm.getName()
                + ", Email: " + contactForm.getEmail()
                + ", Phone: " + contactForm.getPhone()
                + "\n" + "Message: " + contactForm.getMessage();

        try {
            mailService.sendEmail(subject, userMessage, adminEmail, contactForm.getEmail());
            redirectAttributes.addFlashAttribute("isSended", true);
        } catch (MailException e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("isSended", false);
        }
        return "redirect:/contact";
    }
}
