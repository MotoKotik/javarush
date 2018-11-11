package com.javarush.test.level07.lesson06.task05;

/* Delete the last string and add it to the beginning of the list
1. Create a list of strings.
    2. Read from keyboard 5 strings. Add these strings to the list.
    3. Delete the last string and add it to the beginning of the list. Repeat this action 13 times.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
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
            list.add(reader.readLine());
        for (int i = 0; i < 13; i++)
        {
            String temp = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, temp);
        }
        for (String s: list)
            System.out.println(s);

    }
}
