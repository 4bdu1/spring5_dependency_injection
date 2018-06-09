package a4bdul.springframework.didemo.controllers;

import a4bdul.springframework.didemo.services.GreetingService;
import a4bdul.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by 4bdul on 09/06/2018 at 1:48 PM.
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}
