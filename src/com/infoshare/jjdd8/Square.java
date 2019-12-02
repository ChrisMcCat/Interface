package com.infoshare.jjdd8;

public class Square implements Polygon {

    private final int a;

    public Square(int a)
    @Override
    public int getNumberOfSides() {
        return 4;
    }

    @Override
    public int[] getSidesLength() {
        return new int[0] {a,a,a,a};
    }
}
