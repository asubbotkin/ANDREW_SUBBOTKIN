package homework_nr_3;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Hello from HW3!");

        // Task 4.
        int month = 8;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Wrong month!");
        }

        // Task 5.
        for (int i = 100; i < 1001; i++) {
            if ((i % 5) == 0) {
                System.out.println(i);
            }
        }

        // Task 6. Calculation using for cycle:
        double sumDouble = 0d;
        float sumFloat = 0f;
        for (int i = 1; (i + 2) < 100; i += 2) {
            sumDouble += (double) i / (i + 2);
            sumFloat += (float) i / (i + 2);
        }
        System.out.println();
        System.out.println("SumCalculation using for cycle:");
        System.out.println("Sum in double: " + sumDouble);
        System.out.println("Sum in float: " + sumFloat);

        // Task 6. Calculation using while cycle:
        sumDouble = 0d;
        sumFloat = 0f;
        int i = 1;
        while (i + 2 < 100){
            sumDouble += (double) i / (i + 2);
            sumFloat += (float) i / (i + 2);
            i += 2;
        }
        System.out.println();
        System.out.println("Sum calculation using while cycle:");
        System.out.println("Sum in double: " + sumDouble);
        System.out.println("Sum in float: " + sumFloat);
    }
}
