package com.serializable;

import java.io.*;

/**
 * Created by Saurabh on 1/27/2016.
 */
public class SerializeUtil {

    public static Object ObjectDeSerialize(String filename)throws IOException,ClassNotFoundException
    {
        FileInputStream fis=new FileInputStream(filename);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object obj=ois.readObject();
        ois.close();
        return obj;

    }

    public static void ObjectSeriallize(Object obj, String filename)throws IOException
    {
        FileOutputStream fos=new FileOutputStream(filename);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);
        fos.close();

    }
}
