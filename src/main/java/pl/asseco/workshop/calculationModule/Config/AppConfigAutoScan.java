package pl.asseco.workshop.calculationModule.Config;

import org.springframework.context.annotation.*;
import pl.asseco.workshop.calculationModule.Services.*;

/**
 * Created by krzysztof.bogucki on 24 lip 2017.
 */

@Configuration
@ComponentScan(
        basePackages = {"pl.asseco.workshop.calculationModule"},
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = AppConfig.class)
                //@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = LimitAdderProvider.class)
                //@ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*TwoLimitService")
        },
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = LimitAdderProvider.class),
                //@ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*TwoLimitService")
        }
)
public class AppConfigAutoScan {
    

}

