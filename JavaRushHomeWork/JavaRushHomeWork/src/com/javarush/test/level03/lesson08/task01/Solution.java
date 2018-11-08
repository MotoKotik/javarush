package com.javarush.test.level03.lesson08.task01;

/* How to conquer the world
Write a program that reads from keyboard a name and a number and displays the text:
    «name» will conquer the world in «number» years. Bwahaha!
    (The sequence of input data is important.)

    Example:
    Joe will conquer the world in 8 years. Bwahaha!
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        String name = reader.readLine();

        System.out.println(name + " will conquer the world in " + number + " years. Bwahaha!");
    }
}