package homework_nr_15;

import java.util.*;

public class HomeWork15 {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", 2021);
        Car car2 = new Car("BMW", 2023);
        Car car3 = new Car("Lexus", 2020);
        Car car4 = new Car("Toyota", 2015);

        HashSet<Car> carList1 = new HashSet<>(Arrays.asList(car1, car2, car3, car4));

        TreeSet<Car> carList2 = new TreeSet<>(Arrays.asList(car1, car2, car3, car4));

        System.out.println("-------Sorted by year------");
        carList1.stream()
                .sorted()
                .forEach(e -> System.out.println(e));

        System.out.println("-------Sorted by year reverse------");
        carList1.stream()
                .sorted((o1, o2) -> {
                    return Comparator.comparing((Car e) -> e.yearMade)
                            .reversed()
                            .compare(o1, o2);
                })
                .forEach(e -> System.out.println(e));


        System.out.println("------Sorted by Name----------");
        carList1.stream()
                .sorted((o1, o2) -> {
                    return Comparator.comparing((Car e) -> e.name)
                            .compare(o1, o2);
                })
                .forEach(e -> System.out.println(e));

        System.out.println("------Sorted by Name reversed----------");
        carList1.stream()
                .sorted((o1, o2) -> {
                    return Comparator.comparing((Car e) -> e.name)
                            .reversed()
                            .compare(o1, o2);
                })
                .forEach(e -> System.out.println(e));
    }


}
