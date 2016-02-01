package com.compartor;

import com.coneable.*;

import java.util.Comparator;

/**
 * Created by Saurabh on 2/1/2016.
 */
public class ComparatorClass implements Comparator<Box> {

    @Override
    public int compare(Box b1,Box b2)
    {
        int len1=b1.getLength();
        int len2=b2.getLength();
        if(len1>len2)
            return 1;
        else if(len1<len2)
            return -1;
        else return 0;
    }



}
