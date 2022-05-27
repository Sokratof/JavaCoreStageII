package HW4_Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Task_1
        //Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        Collection<String> arrString = new ArrayList<>();
        arrString.add("конфликт");
        arrString.add("лейтенант");
        arrString.add("выступление");
        arrString.add("конфликт");
        arrString.add("параметр");
        arrString.add("вариант");
        arrString.add("характер");
        arrString.add("конфликт");
        arrString.add("параметр");
        arrString.add("конфликт");
        arrString.add("характер");
        arrString.add("параметр");
        arrString.add("конфликт");
        arrString.add("конфликт");
        arrString.add("характер");
        System.out.println("Task_1");
        System.out.println("Size array is " + arrString.size() + " elements");
        System.out.println();
        //Найти и вывести список уникальных слов, из которых состоит массив.
        Set<String> LinkedUniElement = new HashSet<>(arrString);
        System.out.println("Unique elements of array is " + LinkedUniElement);
        System.out.println();
        //Посчитать, сколько раз встречается каждое слово.
        Map<String, Integer> countUniWords = new HashMap<String, Integer>();
        System.out.println("Count repeating");
        for (String word : arrString) {
            Integer oldCount = countUniWords.get(word);
            if (oldCount == null) {
                oldCount = 1;
            }
            countUniWords.put(word, oldCount + 1);
            System.out.println(word + " " + oldCount);
        }
        doHandbook();
    }
//Task_2

        private static void doHandbook() {
            Handbook handbook = new Handbook();
            handbook.addElement("Иванов", "5910");
            handbook.addElement("Иванов", "4567");
            handbook.addElement("Иванов", "4433");
            handbook.addElement("Смирнов", "1111");
            handbook.addElement("Лапшин", "1212");
            handbook.addElement("Терехов", "1457");
            handbook.addElement("Иванов", "12897");
            handbook.addElement("Мартынов", "1267");
            handbook.addElement("Иванов", "1347");
            handbook.addElement("Жаров", "2227");
            handbook.addElement("Иванов", "18752");
            handbook.addElement("Иванов", "1379");
            handbook.addElement("Лукин", "1542");
            handbook.addElement("Смирнов", "2389");

            System.out.println();
            System.out.println("Task_2");
            System.out.println("Иванов" + handbook.getPhones("Иванов"));
            System.out.println("Жаров" + handbook.getPhones("Жаров"));

    }


}

