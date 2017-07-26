package pl.asseco.workshop.calculationModule.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by krzysztof.bogucki on 24 lip 2017.
 */
@Service()
public class AdderServiceTwo {

    private AdderProvider adderProvider;

    @Autowired(required = false)
    public void setAdderProvider(AdderProvider adderProvider) {
        this.adderProvider = adderProvider;
    }

    public Integer sum(){

        Integer sum = 0;

        if(adderProvider == null){

        } else {
            for (Integer item: adderProvider.getItems()) {
                sum += item;
            }
        }

        System.out.println("Obliczono sumę w serwisie i wynosi ona " + sum.toString());

        return sum;
    }

}
