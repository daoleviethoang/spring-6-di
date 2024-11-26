package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello, I'm from GreetingServicePropertyInjected";
    }
}
