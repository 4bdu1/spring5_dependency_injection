package a4bdul.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by 4bdul on 09/06/2018 at 1:51 PM.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!";

    @Override
    public String sayGreeting(){
        return HELLO_GURUS;
    }
}
