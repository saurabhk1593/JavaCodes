package com.comparble;

/**
 * Created by Saurabh on 2/1/2016.
 */
public class Box implements Comparable<Box> {
    int length;
    int breadth;
    int height;

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }


    public String toString() {
        return "Box{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", height=" + height +
                '}';
    }

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

    @Override

    public int compareTo(Box b)
    {
        if(this.getLength()>b.getLength())
            return 1;
        else if(this.getLength()<b.getLength())
            return -1;
        else return 0;
    }


}
