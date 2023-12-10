package com.zhenia.learning.lesson2;

import java.util.Random;

public class ArrayLearning {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
            System.out.println(array[i]);
        }
        System.out.println("Algoritm");
        int max = 0;
        for(int i = 0; i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
    }




       /* String[] week = new String[] {
            "Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday", "Sunday"
        } ;
       String a = week[2];
       switch (a) {
           case("Wednsday"):
               System.out.println(a);
               break;
           default:
               System.out.println("Error");
               break;
       }*/


}


