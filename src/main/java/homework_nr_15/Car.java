package homework_nr_15;

public class Car implements Comparable<Car>{
    protected String name;
    protected int yearMade;

    public Car(String name, int yearMade) {
        this.name = name;
        this.yearMade = yearMade;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearMade=" + yearMade +
                '}';
    }

    @Override
    public int compareTo(Car o) {
         return Integer.compare(this.yearMade, o.yearMade);
    }

}
