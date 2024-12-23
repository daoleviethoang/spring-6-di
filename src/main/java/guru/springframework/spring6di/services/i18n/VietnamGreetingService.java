package guru.springframework.spring6di.services.i18n;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("VN")
@Service("i18NService")
public class VietnamGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Xin Chao The Gioi - VN";
    }
}
