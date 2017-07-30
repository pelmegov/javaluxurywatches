package ru.javaluxurywatches.service.mail;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class BaseMailService {

    private final MailSender mailSender;

    @Autowired
    public BaseMailService(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendEmail(@NonNull String subject,
                          @NonNull String text,
                          @NonNull String to,
                          @NonNull String from) throws MailException {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject(subject);
        message.setText(text);
        message.setTo(to);
        message.setFrom(from);
        mailSender.send(message);
    }

}
