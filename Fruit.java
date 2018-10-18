package ru.chikhachev.se;

public abstract class Fruit {
    Double weight = null;
    Double compar;
    Fruit(){}

    Fruit(Double weight){
        this.weight = weight;
    }

    void setcompar(Double compar){
        this.compar = compar;
    }

    Double getcompar(){
        return compar;
    }
}
