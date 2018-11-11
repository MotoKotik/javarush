package com.javarush.test.level06.lesson08.task01;

/* Class Cat and static variable catCount
Write a static variable int catCount in the class Cat. Create a constructor [public Cat()], in which the given variable should be increased by 1.
*/

public class Cat
{
    public static int catCount = 0;

    public Cat(){
        catCount++;
    }

}
