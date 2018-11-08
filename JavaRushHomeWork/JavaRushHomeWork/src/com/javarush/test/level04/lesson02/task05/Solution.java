package com.javarush.test.level04.lesson02.task05;

/* Count the number of cats
Write a code that counts the number of cats created (count) and then displays it on the screen.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat.count++;

        Cat cat2 = new Cat();
        Cat.count++;

        System.out.println("Cats count is " + Cat.count);
    }
    public static class Cat
    {
        public static int count = 0;
    }
}