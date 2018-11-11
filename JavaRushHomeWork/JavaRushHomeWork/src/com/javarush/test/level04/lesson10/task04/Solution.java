package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-square
Write a program that displays to the screen a square 10x10 of “S” characters. Use “while” loop.
    Don’t separate characters in the same line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 0;
        while (i++ < 10){
            int j = 0;
            while (j++ < 10) System.out.print("S");
            System.out.println();
        }

    }
}
