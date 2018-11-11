package com.javarush.test.level06.lesson11.home01;

/* Class Cat and static variable catCount
Write a static variable public int catCount in the class Cat. Create a constructor [public Cat()].
    Let the static variable catCount increase by 1 every time you create a cat (a new object Cat).
    Create 10 objects Cat and display the value of the variable catCount.
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
            new Cat();

        System.out.println(Cat.catCount);
    }

    public static class Cat
    {
        public static int catCount = 0;

        public Cat(){
            catCount++;
        }
    }

}
