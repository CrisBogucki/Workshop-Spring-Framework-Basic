package pl.asseco.workshop.calculationModule.Config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ResourceBundleMessageSource;
import pl.asseco.workshop.calculationModule.Services.*;

/**
 * Created by krzysztof.bogucki on 24 lip 2017.
 */
@Configuration
public class AppServiceConfig {


//    @Bean
//    public AdderServiceOne adderOneService(){
//        return new AdderServiceOne();
//    }
//
//    @Bean
//    public AdderServiceTwo adderTwoService(){
//        return new AdderServiceTwo();
//    }
//

    @Bean(name="Standard1 konfiguracja podstawowa")
    public LimitAdderProvider standardOneLimitService(){
        return new StandardOneLimitService();
    }

    @Bean(name="Standard2 konfiguracja rozszerzona")
    public LimitAdderProvider standardTwoLimitService(){
        return new StandardTwoLimitService();
    }




}
