package homework_nr_9;

public abstract class Erbivor {
    private int height;
    private int bodyLength;

    public Erbivor(int height, int bodyLength) {
        this.height = height;
        this.bodyLength = bodyLength;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    public abstract void whatItDo();

    public void whereItLives(){
        System.out.println("This elephant lives in Afrika.");
    }

}
