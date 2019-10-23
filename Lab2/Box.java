package com.company;

public class Box {
    int height;
    int width;
    int depth;

    Box() {
        this.height = 1;
        this.width = 1;
        this.depth = 1;
        System.out.println("Box 1 has height = " + this.height + " depth = " + this.depth + " width = " + this.width );
    }

    Box(int a) {
        this.height = a;
        this.depth = a;
        this.width = a;
        System.out.println("Box 2 has height = " + this.height + " depth = " + this.depth + " width = " + this.width );
    }

    Box(int height, int depth, int width) {
        this.height = height;
        this.depth = depth;
        this.width = width;
        System.out.println("Box 3 has height = " + this.height + " depth = " + this.depth + " width = " + this.width );
    }

    public float calculateV() {
        float volume = height * width * depth;
        return volume;
    }

    public float calculateA() {
        float area = 2 * (height * width + height * depth + width * depth);
        return area;
    }
}