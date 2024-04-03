package homework_nr_4;

public class TemperatureConverter {
    float degree;
    public void toCelsius(){
        System.out.println("Temperature in celsius: " + (int)(degree - 32) / 1.8);
    }

    public void  toFahrenheit(){
        System.out.println("Temperature in fahrenheit: " + (int)degree * 1.8 + 32);
    }

    public TemperatureConverter(float degree) {
        this.degree = degree;
    }

    public static void main(String[] args) {
        float temp = 99;
        TemperatureConverter myTemperatureConverter = new TemperatureConverter(temp);
        myTemperatureConverter.toCelsius();
        myTemperatureConverter.toFahrenheit();
    }
}
