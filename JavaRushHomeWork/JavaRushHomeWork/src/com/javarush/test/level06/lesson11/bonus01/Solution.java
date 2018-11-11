package com.javarush.test.level06.lesson11.bonus01;

/* Program doesn’t compile and run. Fix it.
Task: The program should display the maximum of two numbers that are entered from the keyboard in a following way: «Max is 25».
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static int max = 100;
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        String max = "Max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        Solution.max = a > b ? a : b;

        System.out.println(max + Solution.max);
    }

}
