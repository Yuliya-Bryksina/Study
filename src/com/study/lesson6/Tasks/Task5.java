package com.study.lesson6.Tasks;

public class Task5 {
    /**
     * 5. Написать программу, которая проходит циклом по английскому
     * алфавиту, начиная с буквы ‘b’, и выводит каждую букву до тех пор,
     * пока не встретит гласную (т.е. вывести согласные на консоль).
     */


    public static void main(String[] args) {
        int a = 10;

        for (int i = 1; i < a ; i++) {
            System.out.println(i);
            int t = 1;
        }

        int t = 1;
        while (t < a) {
            System.out.println(t);
            t++;
        }
    }


//    public static void printLetters () {
//        for (char letter = 'b'; !isVowel(letter); letter++) {
//            System.out.println(letter);
//        }
//    }
//
    public static boolean isVowel(char value) {
//        int a = 10;
//        int b = 11;
//
//        for (int i = 1; i < 10 ; i++) {
//            System.out.println(i);
//        }
//
//
//        System.out.println(name);
//
//
//        boolean c = a > b;
//        if (a > 10) {
//            return
//        }
      boolean result = 1 > 2;
        return value == 'a' || value == 'e' || value == 'y' || value == 'u' || value == 'i' || value == 'o';
    }


}