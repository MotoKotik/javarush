package com.javarush.test.level04.lesson06.task02;

/* Maximum of four numbers
Write a program that reads four numbers from keyboard and displays to the screen the maximum of these numbers.
*/

import java.io.*;
public class Solution
{
    public static int max(int a, int b)
    {
        if (a>b) return a;
        else return b;
    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        System.out.println(max(max(a,b),max(c,d)));
    }

}
