package com.practiceImpConcept;

/**
 * Created by Saurabh on 2/4/2016.
 */
public class Box {
    int length=20;



    protected void finalize()throws Throwable
    {
        System.out.println("Length of box is"+ length);
    }
}
