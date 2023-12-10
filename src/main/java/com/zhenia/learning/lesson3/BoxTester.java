package com.zhenia.learning.lesson3;
/*. Сделать перегрузку конструкторов
(если 0 параметров - все равны 10, если 1 - все
 три переменные равны этому значению, если три - для каждого все свое)
  То же самое с методом, если 0 параметров тип void, выводим на экран что
  не понятно что делать, если 1 параметр - то объем для куба, если 3 параметра - умножаем
 */

public class BoxTester {
    public static void main(String[] args) {
        Box box1 = new Box(30);
        Box box2 = new Box();
        Box box3 = new Box(20, 30, 40);
      /*  box1.depth = 10;
        box1.height = 15;
        box1.width = 4;
        double volume = box1.depth * box1.width * box1.height;
        System.out.println(volume);
        Box box2 = box1;
        box2.depth = 20;
        System.out.println(box1.depth);
        box1 = null;
        System.out.println(box2.depth);
    }*/
       double volume1 = box1.volume(box1.depth);
        System.out.println(volume1);
        box2.volume();
        double volume3 = box3.volume(box3.depth, box3.width, box3.height);
        System.out.println(volume3);
    }
}
