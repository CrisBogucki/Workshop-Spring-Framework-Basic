package pl.asseco.workshop.calculationModule.Services;

/**
 * Created by krzysztof.bogucki on 24 lip 2017.
 */
public class AdderService {

    private AdderProvider adderProvider;

    public void setAdderProvider(AdderProvider adderProvider) {
        this.adderProvider = adderProvider;
    }

    public Integer sum(){

        Integer sum = 0;
        for (Integer item: adderProvider.getItems()) {
            sum += item;
        }

        System.out.println("Obliczono sumę w serwisie i wynosi ona " + sum.toString());

        return sum;
    }

}
