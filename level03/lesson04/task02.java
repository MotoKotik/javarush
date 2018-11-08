package com.javarush.test.level03.lesson04.task02;

/* My name
Write a program that displays your name on 5 rows. Each row should contain 10 words (your name) separated by a space.
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 10; j++)
                System.out.print("Alina ");
            System.out.print("\n");
        }

    }
}