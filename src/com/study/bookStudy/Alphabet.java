package com.study.bookStudy;
// Демонстрация использования цикла while
public class Alphabet {

    public static void main(String[] args) {
        char ch;
        // Вывод букв английского алфавита. испльзуя цикл while
        ch = 'a';
        while (ch <='z') {
            System.out.print(ch);
            ch ++;
        }
    }

}
