package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public void sayHello() {
        System.out.println("Hello, I'm from GreetingServicePropertyInjected");
    }
}
