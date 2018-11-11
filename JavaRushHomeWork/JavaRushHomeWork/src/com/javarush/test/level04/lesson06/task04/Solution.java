package com.javarush.test.level04.lesson06.task04;

/* Compare names
Write a program that reads two names from keyboard, and if the names are the same, displays «Names are identical».
    Display «Name lengths are equal» if the names are different, but their lengths are equal.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        if (name1.length() == name2.length()){
            if (name1.equals(name2)) System.out.println("Names are identical");
            else System.out.println("Name lengths are equal");
        }

    }
}
