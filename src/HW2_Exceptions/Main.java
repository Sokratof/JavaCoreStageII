package HW2_Exceptions;

public class Main {
    public static void main(String[] args) {
        testSizeRight();
        testSizeWrong();
        sumArray();
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

    private static void sumArray() {
        String[][] arrWrongLiter = new String[][]{{"2", "4", "7", "8"}, {"3", "2", "1", "5"}, {"4", "6", "1", "6"}};
        int[] arrWrongLiter2 = new int[arrWrongLiter.length];

        for (int i = 0; i < arrWrongLiter.length; i++) {
            for (int j = 0; j < arrWrongLiter.length; j++) {
                arrWrongLiter2[j] = Integer.parseInt(arrWrongLiter[i][j]);
            }
        }
    }
}





