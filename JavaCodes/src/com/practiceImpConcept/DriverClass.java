package com.practiceImpConcept;

/**
 * Created by Saurabh on 2/4/2016.
 */
public class DriverClass {
    public static void main(String args[])
    {
//        //Example for finalize method
//        Box b1=new Box();
//        b1.length=10;
//        Box b2=new Box();
//        b2=b1;
//        System.gc();
////        Runtime.getRuntime().runFinalization();
//        System.out.println("Done");

        BoxO b=new BoxO(1,2,3);
        BoxO b1=new BoxO(3,4);

        System.out.println(b.toString());
        System.out.println(b1.toString());

    }
}
