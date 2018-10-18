package ru.chikhachev.se;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Box <T extends Fruit> {
    List<T> array = new ArrayList<>();

    void add(T fruit){
        if (fruit == null) return;
        array.add(fruit);
    }

    void remove(T fruit){
        if (fruit == null) return;
        array.remove(fruit);
    }

    Double getWeight(){
        //array.stream().map(f ->f.weight).distinct().count();
        return array.stream().mapToDouble(f ->f.weight).sum();
    }

    boolean compare(Box<?> another){
            return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    void pourIn(Box<T> another){
        //this.array = another.array.cl;
        this.array.addAll(0, another.array);
        new ArrayList<>().removeAll(another.array);
    }

}
