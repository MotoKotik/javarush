package com.javarush.test.level04.lesson10.task01;

import java.io.*;

/* 10 numbers
Write a program that displays numbers from 1 to 10. Use “while” loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 1;
        while (i <= 10) System.out.println(i++);
    }
}