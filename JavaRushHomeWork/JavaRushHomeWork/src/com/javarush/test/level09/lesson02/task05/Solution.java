package com.javarush.test.level09.lesson02.task05;

/* The method should return a result - its stack trace depth
Write a method that displays and returns its stack trace depth. Stack trace depth is the number of its methods (the number of elements in the list).
*/

public class Solution
{
    public static int getStackTraceDeep()
    {
        System.out.println(Thread.currentThread().getStackTrace().length);
        return Thread.currentThread().getStackTrace().length;
    }
}
