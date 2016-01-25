package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileOutp {

    public void serializOut()
    {
        Serialz sl1=null;

        try {
            FileInputStream fileIn = new FileInputStream("./chandan.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            sl1 = (Serialz) in.readObject();
            in.close();
            fileIn.close();
        }
        catch (IOException i)
        {
            i.printStackTrace();
            return;
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
            return;
        }
        System.out.println("Deseriallization object");
        System.out.println("Employee Name is"+ sl1.name);
        System.out.println("Employee Age is"+sl1.age);
    }
}
