package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    
    final private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("greetingServicePropertyInjected") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    void sayHello() {
        greetingService.sayHello();
    }
}
