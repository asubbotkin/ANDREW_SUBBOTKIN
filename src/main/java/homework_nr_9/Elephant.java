package homework_nr_9;

public class Elephant implements Animal{
    private int age;
    private float weight;

    public Elephant(int age, float weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void eating() {

    }

    @Override
    public void runing() {

    }

    @Override
    public void slipping() {
        Animal.super.slipping();
    }
}
