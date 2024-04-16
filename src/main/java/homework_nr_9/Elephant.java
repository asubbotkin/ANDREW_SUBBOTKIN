package homework_nr_9;

public class Elephant extends Erbivor implements Animal{
    private int age;
    private int weight;

    public Elephant(int height, int bodyLength, int age, int weight) {
        super(height, bodyLength);
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void eating() {
        System.out.println("Elephant eats fruits.");

    }

    @Override
    public void running() {
        System.out.println("Elephant running about 40km/h!");
    }

    @Override
    public void slipping() {
        Animal.super.slipping();
    }


    @Override
    public void whatItDo() {
        System.out.println("Elephant looking for food.");
    }
}
