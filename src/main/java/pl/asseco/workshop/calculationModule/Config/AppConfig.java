package pl.asseco.workshop.calculationModule.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.asseco.workshop.calculationModule.Services.AdderProvider;
import pl.asseco.workshop.calculationModule.Services.AdderService;
import pl.asseco.workshop.calculationModule.Services.FileAdderProvider;

/**
 * Created by krzysztof.bogucki on 24 lip 2017.
 */
@Configuration
public class AppConfig {


    @Bean
    public AdderProvider fileAdderProvider(){
        return new FileAdderProvider();
    }

    @Bean
    public AdderService adderService(){
        AdderService service = new AdderService();
        service.setAdderProvider(fileAdderProvider());
        return service;
    }
}
