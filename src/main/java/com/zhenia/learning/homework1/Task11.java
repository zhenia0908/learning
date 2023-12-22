package com.zhenia.learning.homework1;

import java.util.Scanner;

public class Task11 {
/*	Напишите программу, которая находит первое простое число в диапазоне от 1 до 100.
 Простое число - это число, которое делится только на себя и на 1.
 */


    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            switch (i) {
                case 2:
                    System.out.println("Number is: " + i);
                    break;
                case 3:
                    System.out.println("Number is: " + i);
                    break;
                case 5:
                    System.out.println("Number is: " + i);
                    break;
                case 7:
                    System.out.println("Number is: " + i);
                    break;

                default:
                    if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {

                        System.out.println("Number is: " + i);
                        break;
                    }
            }
            break;
        }
    }
}
