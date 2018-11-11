package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Draw a rectangle
Write a program that reads from keyboard two numbers: m and n.
    The program should display to the screen a rectangle composed of eights sized m by n. Use “for” loop.

    Example: m=2, n=4
    8888
    8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) System.out.print("8");
            System.out.println();
        }

    }
}
