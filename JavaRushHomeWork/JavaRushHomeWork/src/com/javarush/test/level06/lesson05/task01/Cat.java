package com.javarush.test.level06.lesson05.task01;

/* finalize() method of Cat class
Write a method protected void finalize() throws Throwable in the class Cat.
*/

public class Cat
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
    }
}

