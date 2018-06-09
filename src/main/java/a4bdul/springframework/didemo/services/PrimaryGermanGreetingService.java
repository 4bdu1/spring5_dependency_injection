package a4bdul.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by 4bdul on 09/06/2018 at 2:54 PM.
 */
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Primäre Grüße";
    }
}
