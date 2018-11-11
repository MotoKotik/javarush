package com.javarush.test.level05.lesson07.task01;

/* Create a class Friend
Create a class Friend with three initializers (three methods initialize):
    - Name
    - Name, age
    - Name, age, sex
*/

public class Friend
{
    private String name;
    private int age;
    private String sex;

    public void initialize(String name){
        this.name = name;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
