package com.practiceImpConcept;

import java.util.Scanner;

/**
 * Created by Saurabh on 2/4/2016.
 */
public class studentscanner {

    public static void main(String args[])
    {
        int name;
        int age;
        Scanner sc=new Scanner(System.in);
        name=sc.nextInt();
        age=sc.nextInt();
        System.out.print("Name is"+name+"    Age is"+age);


    }
}
