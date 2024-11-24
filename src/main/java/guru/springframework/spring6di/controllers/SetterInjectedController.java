package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    void sayHello() {
        greetingService.sayHello();
    }
}