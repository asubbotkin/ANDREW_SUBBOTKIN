package org.example;

import java.util.Comparator;

public class House implements Comparator<House> {
    private int area;
    private int price;
    private String city;
    private boolean hasFirniture;

    public House(int area, int price, String city, boolean hasFirniture) {
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFirniture = hasFirniture;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", price=" + price +
                ", city='" + city + '\'' +
                ", hasFirniture=" + hasFirniture +
                '}';
    }

    @Override
    public int compare(House house1, House house2) {
        return 0;
    }
}
