package guru.springframework.spring6di.services.environment;

import guru.springframework.spring6di.services.EnvironmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class EnvironmentServiceQa implements EnvironmentService {
    @Override
    public String getEnv() {
        return "qa";
    }
}
