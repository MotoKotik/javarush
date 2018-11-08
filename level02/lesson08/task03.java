package com.javarush.test.level02.lesson08.task03;

/* Minimum of three numbers
Write a function that returns a minimum of three numbers.
*/
public class Solution
{
    public static int min(int a, int b, int c)
    {
        if (a <= b && a <= c)
        {
            return a;
        } 
        else if (b <= c && b <= a) 
        {
            return b;
        }
        else 
        {
            return c;
        }
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(1,2,3) );
        System.out.println( min(-1,-2,-3) );
        System.out.println( min(3,5,3) );
        System.out.println( min(10,5,10) );
    }

}