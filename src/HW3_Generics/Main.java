package HW3_Generics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BoxFruits<Apple> appleBox1 = new BoxFruits<>(3);
        BoxFruits<Apple> appleBox2 = new BoxFruits<>(3);
        BoxFruits<Orange> orangeBox = new BoxFruits<>(2);


        //Наполняем коробки фруктами
        for (int i = 0; i < 4; i++) {
            appleBox1.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
            orangeBox.addFruit(new Orange());
        }
        System.out.println("Вес 1 коробки с яблоками " + appleBox1.getBoxWeight());
        System.out.println("Вес 2 коробки с яблоками " + appleBox2.getBoxWeight());
        System.out.println("Вес 2 коробки с яблоками " + orangeBox.getBoxWeight());

        //Сравненеие веса коробок с яблоками(1) и с апельсинами -?
        appleBox1.addAllAplle(appleBox2);



        String[] arr = {"We", "the", "change", "sequence"};
        System.out.println(Arrays.toString(arr));
        changeElements(arr, 1,2);
        System.out.println(Arrays.toString(arr));
    }

    private static void changeElements(String[] arr, int i1, int i2) {
        Object swap = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = (String) swap;
    }
}

