package a4bdul.springframework.didemo.controllers;

import a4bdul.springframework.didemo.services.GreetingService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by 4bdul on 09/06/2018 at 1:51 PM.
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;


    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
