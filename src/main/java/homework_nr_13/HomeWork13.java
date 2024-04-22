package homework_nr_13;

import java.util.Arrays;

public class HomeWork13 {
    public static void main(String[] args) throws InvalidModelException, InvalidNrOfEngines, InvalidManufacturerException, InvalidRangeException {
        Airplane airplane1 = new Airplane("Boieng", "747", 4);
//        Airplane airplane2 = new Airplane("TU", "134", 4);
//        Airplane airplane3 = new Airplane("IL", "76", 4);

        System.out.println(airplane1.manufacturer + " " + airplane1.model + " " + airplane1.nrOfEngines);

        System.out.println("-------------LBYL------------------");
        Airplane airplane2 = createAirplaneLBYL("AN", "Mria", 6);
        System.out.println(airplane2.manufacturer + " " + airplane2.model + " " + airplane2.nrOfEngines);

        System.out.println("-------------EAFP------------------");
        Airplane airplane3 = createAirplaneEAFP("TU", "134", 0);
        System.out.println(airplane3.manufacturer + " " + airplane3.model + " " + airplane3.nrOfEngines);
        System.out.println("-----------------------------------");

        int inferiorLimit = 10;
        int superiorLimit = 100;

        try {
            System.out.println("Count numbers divisible by :" + countDivisibleBy7Numbers(inferiorLimit, superiorLimit));
        } catch (InvalidRangeException e) {
            System.out.println("Wrong range!");
        }
    }

    public static Airplane createAirplaneLBYL(String manufacturer, String model, int nrOfEngines) throws InvalidManufacturerException, InvalidModelException, InvalidNrOfEngines {
        if (manufacturer != "" && manufacturer != null && model != "" && model != null && nrOfEngines != 0 || nrOfEngines % 2 != 0)
            return new Airplane(manufacturer, model, nrOfEngines);
        else {
            System.out.println("Wrong parameters LBYL!");
            return new Airplane("0", "0", 0);
        }
    }

    public static Airplane createAirplaneEAFP(String manufacturer, String model, int nrOfEngines) throws InvalidManufacturerException, InvalidModelException, InvalidNrOfEngines {
        try {
            return new Airplane(manufacturer, model, nrOfEngines);
        } catch (InvalidModelException | InvalidManufacturerException | InvalidNrOfEngines e) {
            System.out.println("Wrong parameters EAFP!");
            return new Airplane("0", "0", 0);
        }
    }

    public static int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {
        int count = 0;
        if (inferiorLimit < superiorLimit) {
            for (int i = inferiorLimit; i <= superiorLimit; i++)
                if (i % 7 == 0) {
                    count++;
                    System.out.println(i);
                }
        } else {
            throw new InvalidRangeException("Invalid range!");
        }
        return count;
    }
}

