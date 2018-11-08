package com.javarush.test.level03.lesson06.task02;

/* Multiplication table
Write a program that displays the multiplication table 10 by 10 as follows:
    1 2 3 …
    2 4 6 …
    3 6 9 …
    …
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                System.out.print(j*i + " ");
            }
            System.out.println();
        }

    }
}