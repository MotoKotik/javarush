package com.javarush.test.level10.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Learning and practicing algorithm.
Task: Read from the keyboard 30 numbers. Display to the screen the 10th and 11th minimum numbers.
    Hint:
    The minimal number is the 1st minimum.
    The next minimum is the 2nd minimum

    Explanation 1:
    1 6 5  7  1  15   63   88
    The first minimum is 1
    The second minimum is 1
    The third minimum is 5
    The fourth minimum is 6

    Explanation 2:
    0 3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 51 54 57 60 63 66 69 72 75 78 81 84 87
    36 0 6 9 39 42 78 12 15 30 33 63 66 69 3 81 84 87 45 48 51 54 57 60 72 75 18 21 24 27
    69 36 0 18 21 6 27 9 39 42 78 12 33 63 66 3 81 84 87 45 15 30 48 51 54 57 60 72 75 24

    Example input:
    36 0 6 9 39 42 78 12 15 30 33 63 66 69 3 81 84 87 45 48 51 54 57 60 72 75 18 21 24 27

    Example output:
    27
    30
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array)
    {
        Arrays.sort(array);
    }
}
