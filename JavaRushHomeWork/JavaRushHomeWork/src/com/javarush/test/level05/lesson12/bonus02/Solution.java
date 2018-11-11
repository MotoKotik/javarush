package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Add new functionality to the program
Old Task: add a new function that reads from keyboard two numbers and displays their minimum.
    New task: add a new function that reads from keyboard five numbers and displays their minimum.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minimum = Integer.parseInt(reader.readLine());

        for (int i = 0; i < 4; i++) {
            int temp = Integer.parseInt(reader.readLine());
            minimum = min(temp, minimum);
        }

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }

}
