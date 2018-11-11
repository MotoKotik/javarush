package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Arrays;

/* Display an average
Write a program that reads from keyboard three numbers.
    The program should display to the screen the average of these numbers, that is, neither the biggest nor the smallest one.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++)
            nums[i] = Integer.parseInt(reader.readLine());
        Arrays.sort(nums);
        System.out.println(nums[1]);
    }
}
