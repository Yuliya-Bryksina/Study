package com.study.bookStudy;
// Вывод четных чисел в пределах от 0 до 100
public class ContDemo {

    public static void main(String[] args) {
        int i;
        for (i = 0; i < 100; i++) {
            if ((i % 2) !=0) continue;
            System.out.println(i);
        }
    }
}
