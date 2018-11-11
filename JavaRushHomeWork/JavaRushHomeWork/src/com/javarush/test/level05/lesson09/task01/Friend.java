package com.javarush.test.level05.lesson09.task01;

/* Create a class Friend
Create a class Friend with three constructors:
    - Name
    - Name, age
    - Name, age, sex
*/

public class Friend
{
    private String name;
    private int age;
    private String sex;

    public Friend(String name){
        this.name = name;
    }

    public Friend(String name, int age){
    this.name = name;
    this.age = age;
    }

    public Friend(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

}