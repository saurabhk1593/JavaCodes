package com.serializable;

import java.io.Serializable;

/**
 * Created by Saurabh on 1/18/2016.
 */
public class SerializablePojo implements Serializable {
    private String name;

    @Override
    public String toString() {
        return "SerializablePojo{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
