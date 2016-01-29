package com.coneable;

/**
 * Created by Saurabh on 1/18/2016.
 */

//Deep Copy
public class Box implements Cloneable{

    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", height=" + height +
                '}';
    }

    private int length;
    private int breadth;
    private int height;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
