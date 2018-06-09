package a4bdul.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by 4bdul on 09/06/2018 at 2:47 PM.
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}
