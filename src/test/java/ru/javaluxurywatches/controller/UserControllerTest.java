package ru.javaluxurywatches.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.javaluxurywatches.Application;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {Application.class})
class UserControllerTest {

    @Autowired
    private UserController userController;

    @Test
    void testAddUser() {
        assertTrue(userController.testAddUser());
    }

}