package com.javarush.test.level10.lesson11.home02;

/* The correct answer is: d=5.5
Add one type casting operator to obtain d=5.5.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + (double)(b/c)/e;
        System.out.println(d);
    }
}
