package pl.asseco.workshop.calculationModule.Config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ResourceBundleMessageSource;
import pl.asseco.workshop.calculationModule.Services.*;

/**
 * Created by krzysztof.bogucki on 24 lip 2017.
 */
@Configuration
@PropertySource( ignoreResourceNotFound = true, value = { "classpath:app.properties", "file:/${locationProperties}/app2.properties" })
@ImportResource("classpath:appConfig.xml")
public class AppCommonConfig {

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
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public ResourceBundleMessageSource messageSource(){
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasename("i18n/messages");
        return source;
    }


}
