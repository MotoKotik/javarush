package com.javarush.test.level06.lesson08.task05;

/* Class StringHelper
Write a class StringHelper, which will have 2 static methods:
    - String multiply(String s, int count) should return the string s repeated count times.
    - String multiply(String s) should return the string s repeated 5 times.

    Example:
    Amigo -> AmigoAmigoAmigoAmigoAmigo
*/

public class StringHelper
{
    public static String multiply(String s)
    {
        return multiply(s, 5);
    }

    public static String multiply(String s, int count)
    {
        String result = "";
        for (int i = 0; i < count; i++)
            result += s;
        return result;
    }
}
