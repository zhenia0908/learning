package com.zhenia.learning.homework1;

import java.util.ArrayList;
import java.util.Random;

/*	Напишите программу для заполнения массива случайными числами
        от 1 до 100 до тех пор, пока сумма элементов массива не превысит значение 1000.
        Используйте цикл do-while для выполнения этой задачи.*/
public class Task10 {

    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        ArrayList<Integer> numbers = new ArrayList<>();

        do { int i = 0;
           // for (int i = 0; i < numbers.size(); i++) { // метод getLast возвращает последний элемент
               numbers.add(random.nextInt(100) + 1);
                sum += numbers.get(i);
                i++;

        } while (sum <= 1000);
        System.out.println("Summa: " + sum);

    }


}

