package com.javarush.test.level02.lesson08.task05;

/* String duplication
Write a function that displays three times the passed string. Each string should be on a new line.
*/
public class Solution
{
    public static void print3(String s)
    {
        for (int i = 0; i < 3; i++)
            System.out.println(s);
    }

    public static void main(String[] args)
    {
        print3("I love you!");
    }
}