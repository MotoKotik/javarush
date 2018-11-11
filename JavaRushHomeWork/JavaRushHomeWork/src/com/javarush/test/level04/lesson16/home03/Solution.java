package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Calculate a sum
Write a program that reads from keyboard numbers and calculates their sum.
    If the user enters -1, the program should display the sum and terminate. -1 should be included in sum.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            int temp = Integer.parseInt(reader.readLine());
            sum += temp;
            if (temp == -1) break;;
        }
        reader.close();
        System.out.println(sum);
    }
}
