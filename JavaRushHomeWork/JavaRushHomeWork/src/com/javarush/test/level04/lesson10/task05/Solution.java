package com.javarush.test.level04.lesson10.task05;

import java.io.*;

/* Multiplication table
Write a program that displays multiplication table of 10 by 10. Use “while” loop.
    Separate numbers by a space.
    1 2 3 4 5 6 7 8 9 10
    2 4 6 8 10 12 14 16 18 20
    ...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 0;
        while (i++ < 10){
            int j = 0;
            while (j++ < 10) System.out.print(i*j + " ");
            System.out.println();
        }

    }
}
