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

        FuelType.isLiquid(FuelType.DIESEL_51);
        FuelType.isLiquid(FuelType.ELECTRIC);
        FuelType.isLiquid(FuelType.PETROL_95);
        FuelType.isLiquid(FuelType.PETROL_98);
        FuelType.isLiquid(FuelType.PETROL_100);
        FuelType.isLiquid(FuelType.DIESEL_55);
        FuelType.isLiquid(FuelType.METAN);
        FuelType.isLiquid(FuelType.PROPANE);

        System.out.println("------------Check integer-------------------");

        int x = 25;
        int y = -12;

        System.out.println(CheckInteger.CHECK_IF_EVEN.algorithm.test(x));
        System.out.println(CheckInteger.CHECK_IF_POSITIVE.algorithm.test(x));
        System.out.println(CheckInteger.CHECK_IF_ODD.algorithm.test(y));
        System.out.println(CheckInteger.CHECK_IF_NEGATIVE.algorithm.test(y));

        System.out.println("-------------------------------------------");

        CheckInteger[] checkIntegers = CheckInteger.values();
        for(int i = 0; i < checkIntegers.length; i++){
            checkIntegerAndPrintResult(x, checkIntegers[i]);
        }
        System.out.println("--------------------------------------------");
        for(int i = 0; i < checkIntegers.length; i++){
            checkIntegerAndPrintResult(y, checkIntegers[i]);
        }
    }

    public static void checkIntegerAndPrintResult(int x, CheckInteger operation) {
        System.out.println("Input number " + x + " " + operation + " is " + operation.algorithm.test(x));
    }
}
