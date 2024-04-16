package homework_nr_9;

public interface Animal {
    void eating();
    void runing();
    static void swimmng(){}

    default void slipping(){
        System.out.println("On average, an elephant sleeps 2 hours a day!!!");
    }

}
