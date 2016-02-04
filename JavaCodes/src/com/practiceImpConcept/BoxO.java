package com.practiceImpConcept;

/**
 * Created by Saurabh on 2/4/2016.
 */
public class BoxO {
    int length;
    int breadth;
    int height;

    public BoxO(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public BoxO(int l,int b)
    {
        this.length=l;
        this.breadth=b;
        this.height=10;


    }

    @Override
    public String toString() {
        return "BoxO{" +
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
}
