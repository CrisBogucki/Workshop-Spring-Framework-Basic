package pl.asseco.workshop.calculationModule.Config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import pl.asseco.workshop.calculationModule.Services.*;

/**
 * Created by krzysztof.bogucki on 24 lip 2017.
 */
@Configuration
@PropertySource( ignoreResourceNotFound = true, value = { "classpath:app.properties", "file:/${locationProperties}/app2.properties" })
public class AppConfig {

    @Bean("DatabaseDeveloperProvider")
    @Scope("prototype")
    public AdderProvider fileAdderProvider(){
        return new FileAdderProvider();
    }

    @Bean("DatabaseProductionProvider")
    @Scope("prototype")
    @Primary
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
    public LimitAdderProvider standardOneLimitService(){
        return new StandardOneLimitService();
    }

    @Bean(name="Standard2 konfiguracja rozszerzona")
    public LimitAdderProvider standardTwoLimitService(){
        return new StandardTwoLimitService();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }


}
