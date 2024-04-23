package homework_nr_14;

public class HomeWork14 {
    public static void main(String[] args) {
        GenericClass<Integer> genericIntegerObject = new GenericClass<>();
        GenericClass<Double> genericDoubleObject = new GenericClass<>();

        System.out.println("-------Generic Integer----------");
        genericIntegerObject.someNumber.add(23);
        genericIntegerObject.someNumber.add(12);
        genericIntegerObject.someNumber.add(56);
        genericIntegerObject.someNumber.add(213);
        System.out.println(genericIntegerObject.someNumber);
        System.out.println("-------Generic Double------------");
        genericDoubleObject.someNumber.add(12.5);
        genericDoubleObject.someNumber.add(4056.8);
        genericDoubleObject.someNumber.add(875.1);
        genericDoubleObject.someNumber.add(45.12);
        System.out.println(genericDoubleObject.someNumber);

        System.out.println("----------------------------------");
        Car car1 = new Car("BMW", "x5");
        Car car2 = new Car("Opel", "Astra G");
        Airplane airplane1 = new Airplane("Tupolev", "TU-134");
        Airplane airplane2 = new Airplane("Iliushin", "IL-76");
        Airplane airplane3 = new Airplane("Boieng", "747");
        Helicopter helicopter1 = new Helicopter("Kamov", "KA-52");
        Helicopter helicopter2 = new Helicopter("Mikoian", "MI-8");

        //!!! Won`t compile because class Car haven`t implementation with AirVehicles interface!!!
//        Vehicle<Car> carObject = new Vehicle<>();

        Vehicle<Airplane> airplaneObject = new Vehicle<>();
        airplaneObject.addVehicle(airplane1);
        airplaneObject.addVehicle(airplane2);
        airplaneObject.addVehicle(airplane3);
        System.out.println(airplaneObject);

        Vehicle<Helicopter> helicopterObject = new Vehicle<>();
        helicopterObject.addVehicle(helicopter1);
        helicopterObject.addVehicle(helicopter2);
        System.out.println(helicopterObject);
    }
}
