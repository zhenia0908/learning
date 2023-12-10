package com.zhenia.learning.homework1;

import java.util.Random;

public class Task3 {

    public static void main(String[] args) {

        double numbers [] = new double[10];

        Random random = new Random();

       for(int i = 0; i< numbers.length;i++){
            numbers[i] = random.nextDouble();
            System.out.println(numbers[i]);
        }

       /* for(double a: numbers){
            a = random.nextDouble();
            System.out.println(a);не записывает значения
        }*/
        double sum = 0;
       /* for(int i = 0;i<numbers.length;i++){
            sum+=numbers[i];
        }*/
        for( double a: numbers){
            sum += a;
        }
        System.out.println("Sum of numbers: "+ sum);
    }
}
