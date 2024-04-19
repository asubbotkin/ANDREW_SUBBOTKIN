package homework_nr_12;

import java.util.Arrays;

public class HomeWork12 {
    public static void main(String[] args) {

        System.out.println("-------Printing enum elements V.1-----------");
        Month[] months = Month.values();
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        System.out.println("-------Printing enum elements V.2-----------");
        System.out.println(Arrays.toString(Month.values()));

        System.out.println("-------------Fuel Types---------------------");

        System.out.println(FuelType.DIESEL_51.isFuelLiquid);

        FuelType fuel1 = FuelType.PETROL_95;
        FuelType fuel2 = FuelType.PETROL_98;
        FuelType fuel3 = FuelType.PETROL_100;
        FuelType fuel4 = FuelType.ELECTRIC;


        System.out.println("------------Check integer-------------------");

        int x = 25;

        System.out.println(CheckInteger.CHECK_IF_EVEN.algorithm.test(x));
        System.out.println(CheckInteger.CHECK_IF_POSITIVE.algorithm.test(x));
        System.out.println(CheckInteger.CHECK_IF_ODD.algorithm.test(x));
        System.out.println(CheckInteger.CHECK_IF_NEGATIVE.algorithm.test(x));

        System.out.println("-------------------------------------------");

        CheckInteger[] checkIntegers = CheckInteger.values();
        for(int i = 0; i < checkIntegers.length; i++){
            checkIntegerAndPrintResult(x, checkIntegers[i]);
        }

        System.out.println("--------------------------------------------");

        x = -12;

        for(int i = 0; i < checkIntegers.length; i++){
            checkIntegerAndPrintResult(x, checkIntegers[i]);
        }
    }

    public static void checkIntegerAndPrintResult(int x, CheckInteger operation) {
        System.out.println("Input number " + x + " " + operation + " is " + operation.algorithm.test(x));
    }
}
