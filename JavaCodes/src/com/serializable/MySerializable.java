package com.serializable;

/**
 * Created by Saurabh on 1/18/2016.
 */
public class MySerializable {
    public static void main(){
        System.out.print("Serializable");
        SerializablePojo sp = new SerializablePojo();
        System.out.print(sp.toString());
    }
}
