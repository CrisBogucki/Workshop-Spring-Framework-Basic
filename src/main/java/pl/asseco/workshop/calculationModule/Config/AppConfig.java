package pl.asseco.workshop.calculationModule.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.asseco.workshop.calculationModule.Services.*;

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
        return new AdderServiceOne();
    }

    @Bean
    public AdderServiceTwo adderTwoService(){
        return new AdderServiceTwo();
    }

    @Bean
    public LimitAdderProvider standardOneLimitService(){
        return new StandardOneLimitService();
    }

    @Bean
    public LimitAdderProvider standardTwoLimitService(){
        return new StandardTwoLimitService();
    }

}
