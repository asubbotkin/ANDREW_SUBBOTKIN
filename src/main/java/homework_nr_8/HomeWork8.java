package homework_nr_8;

import java.util.*;

public class HomeWork8 {
    private static Set<String> noDuplicates(List<String> list) {
        Set<String> returned = new HashSet<>();
        for (String s : list) {
            returned.add(s);
        }
        return returned;
    }

    private static void printingTodos(List<String> list){
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        List<String> todoList = new ArrayList<>();
        todoList.add("Drink coffe");
        todoList.add("To go to the job");
        todoList.add("To go to the gym");
        todoList.add("To meet friends");

        System.out.println("------------To do list for today--------------");
        System.out.println(todoList);
        System.out.println("----------------------------------------------");
        printingTodos(todoList);


        System.out.println("-----------------------------------------------");
        List<String> entireData = new ArrayList<>();
        entireData.add("AAA");
        entireData.add("BBB");
        entireData.add("AAA");
        entireData.add("CCC");
        entireData.add("BBB");
        entireData.add("DDD");
        entireData.add("CCC");

        System.out.println(noDuplicates(entireData));

        System.out.println("---------------Vocabulary-----------------------");

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("Home", "Casa");
        vocabulary.put("Milk", "Lapte");
        vocabulary.put("Bread", "Piine");
        vocabulary.put("Car", "Auto");
        vocabulary.put("Hat", "Cusma");
        vocabulary.put("Hand", "Mina");
        vocabulary.put("Leg", "Picior");
        vocabulary.put("Bike", "Biciclet");
        vocabulary.put("Mountain", "Munte");
        vocabulary.put("Sea", "Mare");

        System.out.println(vocabulary);
    }
}
