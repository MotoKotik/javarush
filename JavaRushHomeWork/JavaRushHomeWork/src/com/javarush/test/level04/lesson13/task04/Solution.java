package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Draw lines
Write a program that displays
    -	a horizontal line of 10 eights
    -	a vertical line of 10 eights
    Use “for” loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for (int i = 0; i < 10; i++) System.out.print("8");
        System.out.println();
        for (int i = 0; i < 10; i++) System.out.println("8");
    }
}
