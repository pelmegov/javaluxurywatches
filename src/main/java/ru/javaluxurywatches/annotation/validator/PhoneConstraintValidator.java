package ru.javaluxurywatches.annotation.validator;

import ru.javaluxurywatches.annotation.Phone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneConstraintValidator implements ConstraintValidator<Phone, String> {

    private boolean nullable;

    @Override
    public void initialize(Phone phone) {
        this.nullable = phone.nullable();
    }

    @Override
    public boolean isValid(String phoneField, ConstraintValidatorContext cxt) {

        if (nullable && phoneField == null) {
            return true;
        }

        if (!nullable && phoneField == null) {
            return false;
        }

        phoneField = phoneField.trim().replace("-", "");

        if (!phoneField.isEmpty() && phoneField.substring(0, 1).equals("+")){
            return phoneField.matches("^\\+[0-9]{1}[0-9]{9,14}$");
        }
        return phoneField.matches("^[0-9]{9,11}$");
    }

}

