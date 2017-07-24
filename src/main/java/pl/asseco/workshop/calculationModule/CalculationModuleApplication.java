package pl.asseco.workshop.calculationModule;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.asseco.workshop.calculationModule.Config.AppConfig;
import pl.asseco.workshop.calculationModule.Services.AdderService;

@SpringBootApplication
public class CalculationModuleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CalculationModuleApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AdderService service = context.getBean(AdderService.class);
	 	service.sum();

	}
}
