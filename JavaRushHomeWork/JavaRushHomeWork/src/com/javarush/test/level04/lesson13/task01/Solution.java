package com.javarush.test.level04.lesson13.task01;

/* Even numbers
Write a program that displays even numbers from 1 to 100 separated by spaces or each on a new line. Use “for” loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for (int i = 2; i <= 100; i += 2) System.out.println(i);

    }
}
