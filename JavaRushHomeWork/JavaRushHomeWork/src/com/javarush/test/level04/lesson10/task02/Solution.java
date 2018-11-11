package com.javarush.test.level04.lesson10.task02;

import java.io.*;

/* 10 numbers in reverse order
Write a program that displays numbers from 10 to 1. Use “while” loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 10;
        while (i > 0) System.out.println(i--);

    }
}
