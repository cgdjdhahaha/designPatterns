package designPatterns.strategy;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{new Dog(3), new Dog(5), new Dog(1)};
        Sorter.sort(dogs);
        System.out.println(Arrays.toString(dogs));

        System.out.println("hahaha");
    }
}
