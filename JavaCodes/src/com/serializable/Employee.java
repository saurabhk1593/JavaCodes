package com.serializable;

import java.io.Serializable;

/**
 * Created by Saurabh on 1/27/2016.
 */
public class Employee implements Serializable {

    private String name;
    private int age;
    transient private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}
