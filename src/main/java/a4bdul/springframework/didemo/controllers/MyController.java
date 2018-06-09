package a4bdul.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by 4bdul on 09/06/2018 at 1:30 PM.
 */
@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello!!!");

        return "foo";
    }
}


