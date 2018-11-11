package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Learning and practicing algorithms.
Task: Write a program that reads from keyboard 5 numbers and displays them in ascending order.
    Example input:
    3
    2
    15
    6
    17
    Example output:
    2
    3
    6
    15
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[5];
        for (int i = 0; i < 5; i++){
            nums[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(nums);
        for (int i = 0; i < 5; i++){
            System.out.println(nums[i]);
        }
    }
}
