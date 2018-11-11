package com.javarush.test.level07.lesson06.task04;

/* Add 5 strings to the beginning of the list
1. Create a list of strings.
    2. Read from the keyboard 5 strings. Add these strings to the beginning of the list, not to the end.
    3. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
            list.add(0, reader.readLine());
        for (String s: list){
            System.out.println(s);
        }
    }
}
