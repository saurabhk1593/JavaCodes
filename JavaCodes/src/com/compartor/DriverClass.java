package com.compartor;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by Saurabh on 2/1/2016.
 */
public class DriverClass {
    public static void main(String args[])
    {
        Box b1=new Box(10,20,30);
        Box b2=new Box(20,30,40);
        Box b3=new Box(30,40,50);
        ArrayList<Box> l1=new ArrayList<Box>(2);
        l1.add(b1);
        l1.add(b2);
        l1.add(b3);



        Collections.sort(l1,new ComparatorClass());
        for (Box b : l1)
        {
            System.out.println(b.getLength());
        }
    }
}
