package HW2_Exceptions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws MyArrayDataException {
        testSizeRight();
        testSizeWrong();
        sumArray();
        sumArrayNotCount();
    }

    //Корректный массив 4 х 4
    private static void testSizeRight() {
        String[][] arrRight = new String[][]{{"2", "4", "7", "8"}, {"5", "2", "6", "5"},
                {"3", "2", "1", "5"}, {"4", "4", "1", "6"}};
        for (int i = 0; i < arrRight.length; i++) {
            if (arrRight[i].length != 4) ;
        }
    }

    //Не корректный массив 4 х 4
    private static void testSizeWrong() {
        String[][] arrWrong = new String[][]{{"2", "4", "7", "8"}};
        for (int i = 0; i < arrWrong.length; i++) {
            if (arrWrong[i].length != 4) ;
            {
                try {
                    System.out.println("Size array is not 4 x 4 !");
                    throw new MyArraySizeException();

                } catch (MyArraySizeException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //Сумма Parse массива
    private static void sumArray() {
        String[][] arrWrongLiter = new String[][]{{"1", "4", "7", "8"}, {"1", "1", "1", "1"}, {"4", "4", "1", "6"}, {"1", "6", "1", "1"}};
        int[][] arrWrongLiter2 = new int[arrWrongLiter.length][arrWrongLiter.length];

        for (int i = 0; i < arrWrongLiter.length; i++) {
            int sum = 0;
            for (int j = 0; j < arrWrongLiter.length; j++) {
                arrWrongLiter2[i][j] = Integer.parseInt(arrWrongLiter[i][j]);
                sum = IntStream.rangeClosed(0, arrWrongLiter2[0].length -1).mapToObj(k-> arrWrongLiter2[k]).parallel().flatMapToInt(Arrays::stream).sum(); //Эту строку списал
            }
            System.out.println(sum);

            }
        System.out.println("______________________________________________________");
    }

    //Сумма массива не считается из-за символа
    private static void sumArrayNotCount() {
        String[][] arrWrongLiter = new String[][]{{"1", "4", "7", "8"}, {"1", "4", "7", "8"}, {"1", "h", "7", "8"}, {"1", "4", "7", "8"}};
        int[][] arrWrongLiter2 = new int[arrWrongLiter.length][arrWrongLiter.length];

        for (int i = 0; i < arrWrongLiter.length; i++) {
            int sum = 0;
            for (int j = 0; j < arrWrongLiter.length; j++) {
                    try {
                        arrWrongLiter2[i][j] = Integer.parseInt(arrWrongLiter[i][j]);
                    } catch (NumberFormatException e) {
                    e.printStackTrace();}
                    System.out.println(sum);

            }
            }
        //System.out.println("Ошибка в ячейке " е.i  + "X" +е.j);
}}






