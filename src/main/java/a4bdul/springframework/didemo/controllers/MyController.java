package a4bdul.springframework.didemo.controllers;

import a4bdul.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by 4bdul on 09/06/2018 at 1:30 PM.
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!!");

        return greetingService.sayGreeting();
    }
}


