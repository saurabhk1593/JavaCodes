package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by sk00355036 on 1/25/2016.
 */
public class FileInp {
    public void serializin()
    {
        Serialz sl=new Serialz();
        sl.age=25;
        sl.name="Chandan";
        try {
            FileOutputStream fileout = new FileOutputStream("./chandan.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(sl);
            out.close();
            fileout.close();
            System.out.println("Employee Details saved");
        }

        catch (IOException e)
        {
           e.printStackTrace();
        }


    }

}
