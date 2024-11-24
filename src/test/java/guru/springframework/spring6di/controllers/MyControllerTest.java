package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    MyController myController;

    @BeforeEach
    void setUp() {
        myController = new MyController();
    }

    @Test
    void sayHello() {
        myController.sayHello();
    }
}