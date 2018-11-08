package com.javarush.test.level03.lesson08.task02;

/* Salary in 5 years
Write a program that reads from keyboard a name and two numbers. Program should display the text:
    «name» earns «number1» in «number2» years.

    Example:
    Nick earns $150,000 in 5 years.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        System.out.println(name + " earns " + number1 + " in " + number2 + " years.");
    }
}