package homework_nr_10.part_1;

public class Main {
    public static void main(String[] args) {

        int testable = 9;
        String testString = "Print me!";
        System.out.println("--------------------------------------");

        Predicate checkOdd = (int x) -> {
          return (x % 2 == 0) ? true : false;
        };

        Consumer print = (String x) -> {
            System.out.println(x);
        };

        Function multiply = (int x) -> {
          return x * 2;
        };

        Supplier someNumber = () -> {
            return (Math.random() * 100);
        };
        System.out.println(checkOdd.checkOdd(testable));
        System.out.println(multiply.by2(testable));
        print.testString(testString);
        System.out.println(someNumber.returnRandom());
        System.out.println("--------------------------------------");
    }
}
