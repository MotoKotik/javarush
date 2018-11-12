package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Largest and smallest number in an array
Create an array of 20 numbers.
    Fill it with numbers that are read from keyboard.
    Find the largest and smallest number in an array.
    Display to the screen the largest and smallest numbers separated by a space.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        int[] nums = new int[20];
        nums[0] = Integer.parseInt(reader.readLine());
        maximum = minimum = nums[0];
        for (int i = 1; i < 20; i++)
        {
            nums[i] = Integer.parseInt(reader.readLine());
            if (nums[i] > maximum) maximum = nums[i];
            if (nums[i] < minimum) minimum = nums[i];
        }


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
