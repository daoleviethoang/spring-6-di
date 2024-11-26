package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    
    @Autowired
    @Qualifier("greetingServicePropertyInjected")
    GreetingService greetingService;

    public void sayHello() {
        System.out.println(greetingService.sayHello());
    }
}
