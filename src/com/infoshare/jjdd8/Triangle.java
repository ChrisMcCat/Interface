package com.infoshare.jjdd8;

public class Triangle implements Polygon {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;

    }
    @Override
    public int getNumberOfSides() {

        return 3;
    }

    @Override
    public int[] getSidesLength() {

        return new int[0];
    }
}