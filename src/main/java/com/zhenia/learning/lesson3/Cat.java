package com.zhenia.learning.lesson3;

public class Cat {
    String name;
    int age;
    public Cat(int age, String name){
        this.age = age;
        this.name = name;
    }
    public static void main(String[] args) {
        Cat barsik = new Cat(12, "Barsik");
       /* barsik.age = 3;
        barsik.name = "Барсик";*/

        System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
    }
}
