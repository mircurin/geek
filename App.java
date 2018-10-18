package ru.chikhachev.se;

import java.util.Arrays;
import java.util.Collection;

public class App
{
    public static void main( String[] args )
    {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple(15.5));
        appleBox.add(new Apple(8.3));

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        orangeBox.add(new Orange(8.9));
        orangeBox.add(new Orange(6.8));


        System.out.println("Яблочки в коробке: " + appleBox.getWeight());
        System.out.println("Апельсинчики в коробке: " + orangeBox.getWeight());

        if (appleBox.compare(orangeBox)) {
            System.out.println("Коробки равны");
        } else {
            System.out.println("Коробки отличаются");
        }

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.pourIn(appleBox);
        //System.out.println("Коробка 2 заполнена: " + Arrays.toString(appleBox2.array.toArray()));
        System.out.println("Коробка 2 заполнена: " + Arrays.deepToString(appleBox2.array.toArray()));
    }
}
