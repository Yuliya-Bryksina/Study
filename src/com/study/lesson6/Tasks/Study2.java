package com.study.lesson6.Tasks;

/**
 *  2. Имеется число. Посчитать сумму цифр данного числа.
 */

public class Study2 {

    public static void main(String[] args) {
        int value = 123;
        int result = sum (value);
        System.out.println(result);
    }
    public static int sum (int value) {
        int result = 0;
        int currentvalue = value;
        while (currentvalue != 0) {
            result += currentvalue % 10;
            currentvalue /=10;
        }
        return result;
    }
}
