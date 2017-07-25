package pl.asseco.workshop.calculationModule.Services;

/**
 * Created by krzysztof.bogucki on 25 lip 2017.
 */
public interface LimitAdderProvider {

    Integer getMaxSum(Integer sum);
    Integer getMinSum(Integer sum);

    Boolean isMaxLimit();
    Boolean isMinLimit();

}
