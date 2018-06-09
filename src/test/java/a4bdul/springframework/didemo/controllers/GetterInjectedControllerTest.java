package a4bdul.springframework.didemo.controllers;

import a4bdul.springframework.didemo.services.GreetingService;
import a4bdul.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by 4bdul on 09/06/2018 at 1:51 PM.
 */
public class GetterInjectedControllerTest {
    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp() throws Exception{
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());

    }


    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_GURUS,getterInjectedController.sayHello());
    }
}
