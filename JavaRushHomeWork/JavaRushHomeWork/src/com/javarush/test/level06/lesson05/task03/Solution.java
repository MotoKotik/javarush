package com.javarush.test.level06.lesson05.task03;

/* 50,000 objects of Cat class and 50,000 objects of Dog class
Create in a loop 50,000 objects of Cat class and 50,000 objects of Dog class. (Java virtual machine will destroy unused objects, so the method finalize() will be called at least once).
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 50000; i++){
            new Cat();
            new Dog();
        }

    }
}
class Cat
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Cat destroyed");
    }
}

class Dog
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Dog destroyed");
    }
}