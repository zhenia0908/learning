package com.zhenia.learning.homework1;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write a number from 1 to 7: ");
    int a = scanner.nextInt();
    switch (a){
        case(1):
            System.out.println("Monday");
            break;
        case(2):
            System.out.println("Tuesday");
            break;
        case(3):
            System.out.println("Wendsday");
            break;
        case(4):
            System.out.println("Thursday");
            break;
        case(5):
            System.out.println("Friday");
            break;
        case (6):
            System.out.println("Saturday");
            break;
        case (7):
            System.out.println("Sunday");
            break;
        }
    }
}
