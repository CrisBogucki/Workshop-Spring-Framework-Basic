package pl.asseco.workshop.calculationModule;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.asseco.workshop.calculationModule.Config.AppConfig;
import pl.asseco.workshop.calculationModule.Services.AdderServiceOne;
import pl.asseco.workshop.calculationModule.Services.AdderServiceTwo;

@SpringBootApplication
public class CalculationModuleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CalculationModuleApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AdderServiceOne service = context.getBean(AdderServiceOne.class);
	 	service.sum();

//		AdderServiceTwo service1 = context.getBean(AdderServiceTwo.class);
//		service1.sum();

	}
}
