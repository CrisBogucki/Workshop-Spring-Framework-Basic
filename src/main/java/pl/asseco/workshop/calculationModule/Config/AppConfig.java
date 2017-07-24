package pl.asseco.workshop.calculationModule.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.asseco.workshop.calculationModule.Services.AdderProvider;
import pl.asseco.workshop.calculationModule.Services.AdderServiceOne;
import pl.asseco.workshop.calculationModule.Services.AdderServiceTwo;
import pl.asseco.workshop.calculationModule.Services.FileAdderProvider;

/**
 * Created by krzysztof.bogucki on 24 lip 2017.
 */
@Configuration
public class AppConfig {


    @Bean
    @Scope("prototype")
    public AdderProvider fileAdderProvider(){
        return new FileAdderProvider();
    }

    @Bean
    public AdderServiceOne adderService(){
        AdderServiceOne service = new AdderServiceOne();
        service.setAdderProvider(fileAdderProvider());
        return service;
    }

    @Bean
    public AdderServiceTwo adderTwoService(){
        AdderServiceTwo service = new AdderServiceTwo();
        service.setAdderProvider(fileAdderProvider());
        return service;
    }

}
