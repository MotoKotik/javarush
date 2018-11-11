package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* One large and two small arrays
1. Create an array of 20 numbers.
    2. Read from keyboard 20 numbers and fill the array with them.
    3. Create two arrays of 10 numbers each.
    4. Copy numbers of the large array to two small arrays: the half of the numbers to the first array, the other half to the second one.
    5. Display to the screen the second small array. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] nums = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
            nums[i] = Integer.parseInt(reader.readLine());
        for (int i = 10; i < 20; i++)
            System.out.println(nums[i]);

    }
}
