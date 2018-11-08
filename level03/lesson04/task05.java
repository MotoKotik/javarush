package com.javarush.test.level03.lesson04.task05;

/* The sum of 10 numbers
Write a program that displays the sum of numbers from 1 to 10 by lines:
    1
    1+2=3
    1+2+3=6
    1+2+3+4=10
    …
    Example output:
    1
    3
    6
    10
    …
*/

public class Solution
{
    public static void main(String[] args)
    {
        int sum = 0;
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(sum += i);   
        }

    }
}