package homework_nr_2;

// 3. Created class HomeWork2
public class HomeWork2 {
    public static void main(String[] args) {
        // 4. Output to the terminal string "Hello World!"
        System.out.println("Hello World!");

        // 5. Declaration and output of variables of primitive types
        long currentWorldPopulation = 7811080815L;
        int carProducedThisYear = 55235358;
        char firstLetterInAlphabet = 'A';
        boolean javaAmazing = true;
        float pi = 3.14f;

        System.out.println();
        System.out.println("Task 5. Declaration of variables of primitive types");
        System.out.println("long - " + currentWorldPopulation);
        System.out.println("int - " + carProducedThisYear);
        System.out.println("char - " + firstLetterInAlphabet);
        System.out.println("boolean - " + javaAmazing);
        System.out.println("float - " + pi);

        // Task 6. Calculate the value of "total" using a given formula
        double price = 25.15d;
        double tax = 3.5d;
        int quantity = 267;
        double sum = 0d;

        System.out.println();
        System.out.println("Task 6. Calculate the value of \"total\" using a given formula \"total = price + tax * quantity + sum\", where:");
        System.out.println("price = " + price);
        System.out.println("tax = " + tax);
        System.out.println("quantity = " + quantity);
        System.out.println("sum = " + sum);

        /* If we don`t calculate value of "sum" than we do an extra operation "+ sum" in "total" calculation,
        * but if we`ll use some formula for "sum" calculation, for ex. "sum = quantity * price", then
        * the variable "sum" will make sense in "total" calculation, consequently and "total" calculation
        * could be changed for ex. like "total = sum + tax * quantity" */
        double total = price + tax * quantity + sum;
//        total = price + tax*quantity + sum;

        System.out.println();
        System.out.println("total = " + total);
    }
}
