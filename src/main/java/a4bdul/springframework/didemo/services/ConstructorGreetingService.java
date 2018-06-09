package a4bdul.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by 4bdul on 09/06/2018 at 2:23 PM.
 */
@Service
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello -  I was injected via the constructor";
    }
}
