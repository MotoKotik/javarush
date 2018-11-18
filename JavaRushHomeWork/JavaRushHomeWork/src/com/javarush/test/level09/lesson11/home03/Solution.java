package com.javarush.test.level09.lesson11.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/* Turn a method into a try..catch
Read numbers from the keyboard. Write a code for reading numbers from the keyboard into a separate method readData().
    Wrap the whole body of this method (the entire code inside readData() method, except for the declaration of the list where the numbers will be stored) into a try..catch.
    If the user enters some text instead of entering a number, the method has to catch the exception and display to the screen all numbers entered before.
    Display numbers to the screen. Each number should be on a new line. The order of numbers should be just like it was in input.
*/

public class Solution
{
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        List<Integer> list = new ArrayList<>();
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true)
            {
                int input = Integer.parseInt(reader.readLine());
                list.add(input);
            }
        }
        catch (Exception e)
        {
            for (int x: list)
                System.out.println(x);
        }
    }
}
