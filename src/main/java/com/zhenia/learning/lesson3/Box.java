package com.zhenia.learning.lesson3;

public class Box {
    double height;
    double width;
    double depth;

    Box(double depth) {
        this.width = depth;
        this.height = depth;
        this.depth = depth;
    }

    Box(double depth, double width, double height) {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    Box() {
        width = 10;
        height = 10;
        depth = 10;
    }

    public void volume() {
        System.out.println("Error ");
    }

    public double volume(double depth) {
        double a = depth * depth * depth;
        return a;
    }

    public double volume(double depth, double width, double height) {
        double a = depth * width * height;
        return a;
    }
}
