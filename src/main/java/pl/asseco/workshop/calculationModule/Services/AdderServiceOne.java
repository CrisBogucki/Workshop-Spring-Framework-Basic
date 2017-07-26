package pl.asseco.workshop.calculationModule.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by krzysztof.bogucki on 24 lip 2017.
 */
@Service()
public class AdderServiceOne {

    private AdderProvider adderProvider;

    @Autowired(required = false)
    public void setAdderProvider(AdderProvider adderProvider) {
        this.adderProvider = adderProvider;
    }

    @Autowired(required = false)
    //private List<LimitAdderProvider> limitAdderProviders;
    private Map<String, LimitAdderProvider> limitAdderProviders;

    public Integer sum(){

        Integer sum = 0;
        for (Integer item: adderProvider.getItems()) {
            sum += item;
        }

        if(limitAdderProviders != null) {

            System.out.println("Ilość załadowanych komponnetów (Benów) do serwisu: " + limitAdderProviders.size());

            //for(LimitAdderProvider limitAdderProvider: limitAdderProviders){
            for (String providerName : limitAdderProviders.keySet()) {

                System.out.println("Aktualnie do obliczeń używam providera " + providerName);

                LimitAdderProvider limitAdderProvider = limitAdderProviders.get(providerName);

                Integer minLimit = limitAdderProvider.getMinSum(sum);
                Integer maxLimit = limitAdderProvider.getMaxSum(sum);

                if (limitAdderProvider.isMinLimit()) {
                    sum = minLimit;
                } else if (limitAdderProvider.isMaxLimit()) {
                    sum = maxLimit;
                }

            }
        } else {
            System.out.println("Nie załadowano komponentów typu LimitAdderProvider");
        }

        System.out.println("Obliczono sumę w serwisie i wynosi ona " + sum.toString());

        return sum;
    }

    @Value("${osName1: To jest nasza wartość domyślna i weź ja wtedy kiedy nie znajdzisz wartości zdefiniowanej}")
    private String name;

    public void osInfo(){

        System.out.println("Domyślny system operacyjny dla naszej aplikacji: " + this.name);

    }

    @Autowired
    private MessageSource mgs;

    public void hellowWorld(){
        System.out.println("Powitanie: " + mgs.getMessage("hellow", null, null));
    }

}
