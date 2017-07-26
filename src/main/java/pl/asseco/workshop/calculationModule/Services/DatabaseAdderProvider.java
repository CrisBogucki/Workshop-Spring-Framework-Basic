package pl.asseco.workshop.calculationModule.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by krzysztof.bogucki on 24 lip 2017.
 */
@Service
@Scope("prototype")
@Primary
public class DatabaseAdderProvider implements AdderProvider {

    private Random generator;
    private Integer maxGen;

    public DatabaseAdderProvider() {
        this.generator = new Random();
        this.maxGen  = generator.nextInt(10);
    }

    @Override
    public ArrayList<Integer> getItems() {

        System.out.println("Instancja DatabaseAdderProvider-a " + hashCode());

        //TODO: Implement load Integers from database
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i <= this.maxGen; i++){
            list.add(i);
        }

        System.out.println("Pobranie danych z bazy");
        return list;
    }
}
