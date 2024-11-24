package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

public class ConstructorInjectedController {
    final private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    void sayHello() {
        greetingService.sayHello();
    }
}
