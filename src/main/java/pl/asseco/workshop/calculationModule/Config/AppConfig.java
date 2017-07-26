package pl.asseco.workshop.calculationModule.Config;

import org.springframework.context.annotation.*;
import pl.asseco.workshop.calculationModule.Services.*;

/**
 * Created by krzysztof.bogucki on 24 lip 2017.
 */
@Configuration
public class AppConfig {

    @Bean("DatabaseDeveloperProvider")
    @Scope("prototype")
    @Profile("dev")
    public AdderProvider fileAdderProvider(){
        return new FileAdderProvider();
    }

    @Bean("DatabaseProductionProvider")
    @Scope("prototype")
    @Profile("prod")
    public AdderProvider databaseAdderProvider(){
        return new DatabaseAdderProvider();
    }

    @Bean
    public AdderServiceOne adderOneService(){
        return new AdderServiceOne();
    }

    @Bean
    public AdderServiceTwo adderTwoService(){
        return new AdderServiceTwo();
    }

    @Bean(name="Standard1 konfiguracja podstawowa")
    @Profile("dev")
    public LimitAdderProvider standardOneLimitService(){
        return new StandardOneLimitService();
    }

    @Bean(name="Standard2 konfiguracja rozszerzona")
    @Profile("prod")
    public LimitAdderProvider standardTwoLimitService(){
        return new StandardTwoLimitService();
    }

}
