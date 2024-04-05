package homework_nr_5;

public class HomeWork5 {
    public static void main(String[] args) {

        int[] numbers = new int[101];
        int index = 0;
        int sumOfEven = 0;
        long multOfOdd = 1;

        System.out.println();
        System.out.println("numbers[] elements:");

        for (int i = 100; i >= 0; i--) {
            numbers[index] = i;
            System.out.print(numbers[index] + " ");
            if ((numbers[index] % 2) == 0) sumOfEven += numbers[index];
            else multOfOdd *= numbers[index];
            index++;
        }

        System.out.println();
        System.out.println("-----------------");
        System.out.println("Sum of even numbers: " + sumOfEven);
        System.out.println("Multiplication result of odd numbers: " + multOfOdd);

        System.out.println();
        System.out.println("-----------------");
        System.out.println("copyNumbers[] elements:");

        int[] copyNumbers = new int[101];

        for (int i = 0; i < numbers.length; i++) {
            copyNumbers[i] = numbers[i];
            System.out.print(copyNumbers[i] + " ");
        }
    }

}
