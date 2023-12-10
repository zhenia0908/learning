package com.zhenia.learning.homework1;

public class Task9 { //cумма цифр числа
    // 348 = 3 *100 + 4*10 + 8
    public static void main(String[] args) {

        int a = 3483;
       /* int  c = a / 100;
       System.out.println(c);
        int d = (a - 100*c)/10;
       System.out.println(d);
        int e = ((a-100*c)-10*d);
       System.out.println(e);
        int sum = c+d+e;
        System.out.println(sum);*/

        int sum = 0;
       while(a>0){
       int b = a % 10;
       sum += b;
       a = (a-b)/10;
       }
        System.out.println("Summ of letters in a number: " + sum);
    }
}
