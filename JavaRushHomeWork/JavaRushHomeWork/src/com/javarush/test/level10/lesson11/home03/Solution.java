package com.javarush.test.level10.lesson11.home03;

/* The correct answer is: d=1.0
Add one type casting operator to obtain d=1.0.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte)a + b/c/e;

        System.out.println(d);
    }
}
