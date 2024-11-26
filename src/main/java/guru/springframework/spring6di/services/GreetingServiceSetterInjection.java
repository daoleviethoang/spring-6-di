package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("settingGreetingService")
public class GreetingServiceSetterInjection implements GreetingService {
    @Override
    public void sayHello() {
        System.out.println("Hello, I'm from GreetingServiceSetterInjection");
    }
}
