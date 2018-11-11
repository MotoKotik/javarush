package com.javarush.test.level05.lesson07.task02;

/* Create a class Cat
Create a class Cat with five initializers:
    - Name
    - Name, weight, age
    - Name, age (standard weight)
    - Weight, color, (name, address and age are unknown, it’s an alley cat)
    - Weight, color, address (it’s someone’s house cat)
    Initializer’s task is to make an object valid. For example, if the weight is unknown, you need to specify some average weight. A cat can’t have any weight at all, likewise age. But it can have no name (null). The same applies to the address - can be null.
*/

public class Cat
{
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public void initialize(String name)
    {
        this.name = name;
        this.age = 4;
        this.weight = 2;
    }

    public void initialize(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = 2;
    }

    public void initialize(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address = null;
        this.age = 2;
    }

    public void initialize(int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 2;
        this.name = null;
    }

}
