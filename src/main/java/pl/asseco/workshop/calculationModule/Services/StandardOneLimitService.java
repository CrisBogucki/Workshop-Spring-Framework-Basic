package pl.asseco.workshop.calculationModule.Services;

/**
 * Created by krzysztof.bogucki on 25 lip 2017.
 */
public class StandardOneLimitService implements LimitAdderProvider {

    private Boolean isMaxLimit = false;
    private Boolean isMinLimit = false;

    public Integer getMaxSum(Integer sum) {

        Integer max = 10;

        if(sum > max){
            System.out.println("Wystąpiło ograniczenie przez dostawce ograniczenia z góry... (" + sum + ") STANDARD 1");
            this.isMaxLimit = true;
            return max;
        } else {
            return sum;
        }
    }

    public Integer getMinSum(Integer sum) {

        Integer min = 1;

        if(sum < min){
            System.out.println("Wystąpiło ograniczenie przez dostawce ograniczenia z dołu... (" + sum + ") STANDARD 1");
            this.isMinLimit = true;
            return min;
        } else {
            return sum;
        }

    }

    public Boolean isMaxLimit() {
        return isMaxLimit;
    }

    public Boolean isMinLimit() {
        return isMinLimit;
    }
}
