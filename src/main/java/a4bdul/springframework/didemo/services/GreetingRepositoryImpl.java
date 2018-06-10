package a4bdul.springframework.didemo.services;

import org.springframework.stereotype.Component;

/**
 * Created by 4bdul on 10/06/2018 at 4:11 AM.
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Primäre Grüße";
    }
}
