package frisky51.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "^^Injected Contructor^^";
    }
}
