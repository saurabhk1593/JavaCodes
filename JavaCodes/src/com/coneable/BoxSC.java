package com.coneable;

import java.util.Date;

/**
 * Created by Saurabh on 1/28/2016.
 */
public class BoxSC implements Cloneable{

    private int length;
    private int breadth;
    private int height;
    private Date date;

    public BoxSC(int l,int b,int h,Date date)
    {
        length=l;
        breadth=b;
        height=h;
        this.date = date;
    }

    @Override
    public String toString() {
        return "BoxSC{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", height=" + height +
                ", date=" + date +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Object clone()throws CloneNotSupportedException
    {
        BoxSC bsc=null;
        bsc=(BoxSC)super.clone();
        bsc.date=(Date)date.clone();
        return bsc;



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
