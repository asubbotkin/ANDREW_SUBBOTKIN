package homework_nr_9;

public class HomeWork9 {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        Animal elephantObject = new Elephant(5, 7, 50, 5000);
        elephantObject.eating();
        elephantObject.running();
        elephantObject.slipping();
        Animal.swimming();

        System.out.println("------------------------------------");
        Erbivor elephantObject1 = new Elephant(5, 6, 60, 6000);
        elephantObject1.whatItDo();
        elephantObject1.whereItLives();

    }
}
