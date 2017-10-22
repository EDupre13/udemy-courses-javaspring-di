package frisky51.springframework.controller;

import frisky51.springframework.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return  greetingService.sayGreeting();
    }
}
