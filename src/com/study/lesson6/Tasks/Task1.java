package com.study.lesson6.Tasks;

/**
 * Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */
public class Task1 {

    public static void main(String[] args) {
        int value = 9;
        int result = factorial(value);
        System.out.println(result);
        int result2 = factorial(value);
        System.out.println(result2);
    }
    public static int factorialWhile(int value) {
        int result2 = 1;
        int i = 1;
        while (i <= value) {
            result2 *=value;
            i++;
        }
        return result2;
    }

    public static int factorial (int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

}
