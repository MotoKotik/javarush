package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Stop Look Listen. Now capitalized
Write a program that should read from the keyboard a string.
    The program should replace the first letters of all words in the text with the uppercase.
    Display to the screen the result.

    Example input:
    stop look listen
    Example output:
    Stop Look Listen
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] s = reader.readLine().toCharArray();
        s[0] = Character.toUpperCase(s[0]);
        for (int i = 0; i < s.length - 1; i++)
            if (s[i] == ' ' && s[i+1] != ' ') s[i+1] = Character.toUpperCase(s[i+1]);
        for (int i = 0; i < s.length; i++)
            System.out.print(s[i]);
    }


}
