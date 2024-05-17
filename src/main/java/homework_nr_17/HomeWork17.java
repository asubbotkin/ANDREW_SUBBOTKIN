package homework_nr_17;

public class HomeWork17 {
    public static void main(String[] args) {
        Runnable runnableObject0 = () -> {
            String color = Constants.ANSI_RED;
            printLetters(color);
        };
        Runnable runnableObject1 = () -> {
            String color = Constants.ANSI_BLUE;
            printLetters(color);
        };
        Runnable runnableObject2 = () -> {
            String color = Constants.ANSI_GREEN;
            printHello(color);
        };
        Runnable runnableObject3 = () -> {
            String color = Constants.ANSI_PURPLE;
            printHello(color);
        };

        Thread t0 = new Thread(runnableObject0);
        Thread t1 = new Thread(runnableObject1);
        Thread t2 = new Thread(runnableObject2);
        Thread t3 = new Thread(runnableObject3);

        t0.start();
        t0.interrupt();
        t1.start();

        t2.start();
        t3.start();
    }

    public static synchronized void printLetters(String color) {
        for (char i = 'A'; i <= 'Z'; i++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(color + Thread.currentThread().getName() + " was interrupted!");
            }
            System.out.println(color + i + " " + Thread.currentThread().getName());
        }
    }
    public static void printHello(String color){
        System.out.println(color + Thread.currentThread().getName() + " is going to sleep!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        System.out.println(color + "Hello from " + Thread.currentThread().getName() + " I slept well!");
    }
}