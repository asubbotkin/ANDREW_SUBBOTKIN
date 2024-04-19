package homework_nr_9;

public interface Animal {
    void eating();
    void running();
    static void swimming(){
        System.out.println("Elephant takes a bath!");
    }

    default void slipping(){
        System.out.println("On average, an elephant sleeps 2 hours a day!!!");
    }

}
