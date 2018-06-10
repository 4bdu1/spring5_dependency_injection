package a4bdul.springframework.didemo.config;

import a4bdul.springframework.didemo.examplebeans.FakeDataSource;
import a4bdul.springframework.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by 4bdul on 10/06/2018 at 8:02 AM.
 */
@Configuration
public class PropertyConfig {

    @Value("${a4bdul.username}")
    String user;

    @Value("${a4bdul.password}")
    String password;

    @Value("${a4bdul.url}")
    String url;

    @Value("${abdul.jms.username}")
    String jmsUsername;

    @Value("${abdul.jms.password}")
    String jmsPassword;

    @Value("${abdul.jms.url}")
    String jmsUrl;


    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }


    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);

        return fakeJmsBroker;
    }
}
