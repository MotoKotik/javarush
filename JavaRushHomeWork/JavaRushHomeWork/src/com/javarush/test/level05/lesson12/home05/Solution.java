package com.javarush.test.level05.lesson12.home05;

/* Read numbers from keyboard and calculate their total
Read numbers from keyboard and calculate their total until the user enters the word «total». Display to the screen the total.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int total = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String temp = reader.readLine();
            if ("сумма".equals(temp)) break; //WTF?! "total" doesn't work!
            else total += Integer.parseInt(temp);
        }
        reader.close();
        System.out.println(total);
    }
}
