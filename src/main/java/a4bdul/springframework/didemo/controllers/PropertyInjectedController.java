package a4bdul.springframework.didemo.controllers;

import a4bdul.springframework.didemo.services.GreetingServiceImpl;

/**
 * Created by 4bdul on 09/06/2018 at 1:48 PM.
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

}
