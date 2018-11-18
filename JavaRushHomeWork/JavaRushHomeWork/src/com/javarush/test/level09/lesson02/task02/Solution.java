package com.javarush.test.level09.lesson02.task02;

/* StackTrace again
Write five methods that call each other. Each method should return the name of its caller method.
    You can obtain caller method using StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2()
    {
        method3();
        return Thread.currentThread().getStackTrace()[2].getMethodName();

    }

    public static String method3()
    {
        method4();
        return Thread.currentThread().getStackTrace()[2].getMethodName();

    }

    public static String method4()
    {
        method5();
        return Thread.currentThread().getStackTrace()[2].getMethodName();

    }

    public static String method5()
    {
        return Thread.currentThread().getStackTrace()[2].getMethodName();

    }
}
