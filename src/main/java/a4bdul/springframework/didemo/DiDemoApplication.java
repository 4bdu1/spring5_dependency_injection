package a4bdul.springframework.didemo;

import a4bdul.springframework.didemo.controllers.ConstructorInjectedController;
import a4bdul.springframework.didemo.controllers.MyController;
import a4bdul.springframework.didemo.controllers.PropertyInjectedController;
import a4bdul.springframework.didemo.controllers.SetterInjectedController;
import a4bdul.springframework.didemo.examplebeans.FakeDataSource;
import a4bdul.springframework.didemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

		System.out.println(fakeJmsBroker.getUsername());
	}
}
