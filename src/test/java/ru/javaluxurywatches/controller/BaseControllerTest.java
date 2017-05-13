package ru.javaluxurywatches.controller;

import ru.javaluxurywatches.config.ApplicationConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ApplicationConfig.class})
@ExtendWith(SpringExtension.class)
class BaseControllerTest {

    @Autowired
    private BaseController baseController;

    @Test
    void testMethod() {
        Assertions.assertTrue(baseController.testMethod());
    }

}