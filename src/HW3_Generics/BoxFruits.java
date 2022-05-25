package HW3_Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class BoxFruits<T> {

    ArrayList<T> fruits = new ArrayList<T>();
    public double weightFruit = 0.0;

    public <T> BoxFruits(double weightFruit) {
        this.weightFruit = weightFruit;
    }
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
    public double getBoxWeight(){
        return fruits.size() * weightFruit;
    }
    public void addAllAplle(BoxFruits<T> boxFruits){
        fruits.addAll(boxFruits.fruits);
        System.out.println("Количество яблок в 1 коробке после пересыпки " + fruits.size());
        System.out.println("Количество яблок во 2 коробке после пересыпки " + boxFruits.fruits.size());

    }
}
