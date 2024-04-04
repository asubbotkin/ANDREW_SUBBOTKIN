package homework_nr_5;

public class HomeWork5 {
    public static void main(String[] args) {
        int sumOfEven = 0;
        long multOfOdd = 1;
        int[] myArray = new int[101];
        for(int i = 100; i >= 0; i--){
            myArray[i] = i;
            System.out.print(myArray[i]+" ");
            if((myArray[i] % 2) == 0) sumOfEven += myArray[i];
            else multOfOdd *= myArray[i];
        }
        System.out.println();
        System.out.println("-----------------");
        System.out.println("Sum of even numbers: " + sumOfEven);
        System.out.println("Multiplication of odd numbers: " + multOfOdd);
    }
}
