package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService {
    @Override
    public void sayHello() {
        System.out.println("Hello, I'm from Greeting Service Primary");
    }
}
