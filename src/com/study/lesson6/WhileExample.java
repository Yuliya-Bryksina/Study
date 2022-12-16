package com.study.lesson6;

public class WhileExample {

    public static void main(String[] args) {
    int value = 0;
    do {
        System.out.println(value);
        value++;
    } while (value <= 10);
    }

    private static void extracted() {
        int value = 10;
        while (value > 10) {
            System.out.println(value);
            value--;
        }
    }
}
