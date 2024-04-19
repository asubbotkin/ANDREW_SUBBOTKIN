package homework_nr_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class HomeWork11 {
    public static void main(String[] args) {

        List<String> randomStrings = new ArrayList<>(Arrays.asList
                ("home", "man", "women", "dog", "cAt", "flat", "dor", "Act", "river", "mountain"));

        List<String> filteredRandomString = randomStrings.stream()
                .map((e) -> e.toLowerCase())
                .filter((e) -> e.length() < 5 && e.contains("a"))
                .toList();
        System.out.println("-------------------------------------------");

        System.out.println(filteredRandomString);


        List<Person> personsList = new ArrayList<>();
        personsList.addAll(Arrays.asList(
                new Person("Andrew", "Subbotkin", 45, true),
                new Person("Ivan", "Sidorov", 20, true),
                new Person("Irina", "Ivanova", 25, false),
//                new Person("Irina", "Petrova", 25, false),
                new Person("Pert", "Gutu", 35, true),
                new Person("Olga", "Feodorova", 33, false),
                new Person("Tatiana", "Nikonova", 28, false),
                new Person("Igor", "Ciobanu", 29, true),
                new Person("Egor", "Soloviov", 22, true),
                new Person("Marina", "Stepanova", 31, false),
                new Person("Svetlana", "Cretu", 39, true)
        ));

        System.out.println("------------Men under 30-------------------");

        List<String> menLess30 = personsList.stream()
                .filter((e) -> e.isMale && e.age < 30)
                .map((e) -> e.getName())
                .toList();

        System.out.println(menLess30);

        System.out.println("------------Wemen under 30-----------------");
        Optional<Person> wemenUnder30P = personsList.stream()
                .filter((e) -> !e.isMale())
                .filter((e) -> e.age < 30)
                .filter((e) -> e.surname.contains("P"))
                .findFirst();

        if (wemenUnder30P.isPresent()) {
            System.out.println(wemenUnder30P);
        }else {
            System.out.println("There is no any person matching the request!");
        }

//                I don`t know what I have write here instead of boolean!!!
//        System.out.println(wemenUnder30P.orElse("Missing", "Missing", -1, ));

    }

}
