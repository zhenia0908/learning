package com.zhenia.learning.homework1;

//8.	Напишите программу для вывода таблицы умножения от 1 до 10, используя вложенный цикл for.
// Каждая строка таблицы должна быть представлена в формате "1 * n = результат", где n изменяется от 1 до 10.
public class Task8 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int n = 1; n <= 10; n++) {

                int result = i * n;
                System.out.println(i + "*" + n + "=" + result);
            }
        }
    }
}
