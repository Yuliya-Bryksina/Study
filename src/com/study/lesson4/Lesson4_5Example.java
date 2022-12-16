package com.study.lesson4;

public class Lesson4_5Example {

    public static void main(String[] args) {
        int year = 1994;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " високосный");
        }
        else {
            System.out.println(year + " не високосный");
        }
    }
}
