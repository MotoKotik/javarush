package com.javarush.test.level04.lesson06.task03;

/* Sort three numbers
Write a program that reads three numbers from keyboard and displays them in descending order.
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] nums = new Integer[3];
        for (int i = 0; i < 3; i++){
            nums[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(nums, Collections.reverseOrder());
        for (int i = 0; i < 3; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
