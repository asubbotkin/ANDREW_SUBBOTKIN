package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("This is my 2-nd homework");
        System.out.println("This is my 3-rd homework");
        System.out.println("This is my 4-th homework");
        System.out.println("This is my 5-th homework");
        System.out.println("This is my 6-th homework");
        System.out.println("This is my 8-th homework");
        System.out.println("This is my 9-th homework");
        System.out.println("This is my 10-th homework");
        System.out.println("This is my 11-th homework");
        System.out.println("This is my 12-th homework");
        System.out.println("This is my 13-th homework");
        System.out.println("This is my 14-th homework");

        List<House>  houseList = new ArrayList<>(Arrays.asList(
                new House(100, 200000, "Paris", true),
                new House(80, 140000, "Tokio", false)
        ));
    }
}