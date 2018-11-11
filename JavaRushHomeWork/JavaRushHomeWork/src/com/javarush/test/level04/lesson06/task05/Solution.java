package com.javarush.test.level04.lesson06.task05;

/* 18+
Write a program that reads a name and age from keyboard. If the age is less than 18 display «Grow up a little»
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age < 18) System.out.println("Grow up a little");
    }
}
