package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.FormatFlagsConversionMismatchException;

/* 2 arrays
1. Create one array of 10 strings.
    2. Create another array of 10 numbers.
    3. Read from the keyboard 10 strings and fill the string array with them.
    4. Write the length of a string from each cell of the string array in the cell of numbers array with the same index.  Display to the screen the contents of the array of numbers. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] strings = new String[10];
        int[] numbers = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {
            strings[i] = reader.readLine();
            numbers[i] = strings[i].length();
        }
        for (int i = 0; i < 10; i++)
        {
            System.out.println(numbers[i]);
        }
        reader.close();
    }
}
