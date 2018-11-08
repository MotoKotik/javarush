package com.javarush.test.level03.lesson08.task05;

/* Pure love
Write a program that reads from keyboard three names and displays the text:
    «name1» + «name2» + «name3» = Pure love, oh, yeah! Right!

    Example:
    Joe + Eva + Angelica = Pure love, oh, yeah! Right!
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Pure love, oh, yeah! Right!");

    }
}