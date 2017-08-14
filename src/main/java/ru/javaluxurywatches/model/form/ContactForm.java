package ru.javaluxurywatches.model.form;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import ru.javaluxurywatches.annotation.Phone;

import javax.validation.constraints.Size;

@Data
public class ContactForm {

    @NotEmpty
    @Size(min = 3, max = 64)
    private String name;

    @Phone(nullable = true)
    private String phone;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Size(min = 3, max = 1024)
    private String message;

}