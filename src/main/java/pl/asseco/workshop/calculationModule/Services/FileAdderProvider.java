package pl.asseco.workshop.calculationModule.Services;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by krzysztof.bogucki on 24 lip 2017.
 */
public class FileAdderProvider implements AdderProvider {

    private Random generator;
    private Integer maxGen;

    public FileAdderProvider() {
        this.generator = new Random();
        this.maxGen  = generator.nextInt(10);
    }

    @Override
    public ArrayList<Integer> getItems() {

        //System.out.println("Instancja FileAdderProvider-a " + hashCode());

        //TODO: Implement load Integers from file
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i <= this.maxGen; i++){
            list.add(i);
        }

        System.out.println("Pobtanie danych z pliku");
        return list;
    }
}
