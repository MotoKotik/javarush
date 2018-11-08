package com.javarush.test.level02.lesson08.task04;

/* Minimum of four numbers
Write a function that returns a minimum of four numbers.
    The function min(a,b,c,d) has to use (call) the function min(a, b)
*/
public class Solution
{
    public static int min(int a, int b, int c, int d)
    {
        return min(min(a,b), min(c,d));

    }

    public static int min(int a, int b)
    {
        if (a < b) return a;
        else return b;

    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(-20, -10) );
        System.out.println( min(-20, -10, -30, -40) );
        System.out.println( min(-20, -10, -30, 40) );
    }
}