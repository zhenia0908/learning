package com.zhenia.learning.homework1;

import java.util.Scanner;

public class Task11 {
    /*	Напишите программу, которая находит первое простое число в диапазоне от 1 до 100.
     Простое число - это число, которое делится только на себя и на 1.

     Нам нужно проверить, делиться ли оно без остатка на цифры от 2 до 9
     (исключая его же значение, то есть у тебя должна быть проверка, делишь
     только в том случае, если они не равны). И когда встречается такое число,
     на которое делится без остатка (если встречается)
     заканчиваешь проверку и идешь к следующему числу.
      Если все-таки ни на что не делится - это наш ответ
     */
// int result - вне цикла
    // boolean isSimple = true;
    // int i = 984, to 992
    //for a = 2 to 9
    // делим -> (% == 0) AND (i != a)
    // isSimple = false (result = i)
    // while (isSimple) {...}
    // i ++
    public static void main(String[] args) {
        int result = 0;
        boolean isSimple = true;
        while (isSimple) {
            for (int i = 984; i <= 992; i++) {
                for (int a = 2; a <= 9; a++) {
                    if (i % a == 0 && i != a) { //990 : 2
                        break;
                    }
                    result = i;
                }
            }
            isSimple = false;
            System.out.println("Number is simple " + result);
        }
    }
}

   /* public static void main(String[] args) {
        int result = 0;
        boolean isSimple = true;
        while (isSimple) {
            for (int i = 984; i <= 992; i++) {
                for (int a = 2; a <= 9; a++) {
                    if (i % a == 0 && i != a) {
                        isSimple = false;

                    }
                    result = i;
                }
            }
            System.out.println("Number is simple " + result);
        }

    }
}




        /*for (int i = 1; i <= 100; i++) {
            int a = 1;
            while (a <= 9) {

                if (i % a == 0) {
                    if (a != i) {
                        System.out.println();
                    } else {
                        System.out.println("Number is " + i);
                    }
                    a++;
                }

            }
        }
    }
}*/

