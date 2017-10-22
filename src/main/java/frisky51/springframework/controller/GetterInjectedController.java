package frisky51.springframework.controller;

import frisky51.springframework.services.GreetingService;

public class GetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return  this.greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
