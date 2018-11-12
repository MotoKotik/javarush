package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 5 words in reverse order
Read from the keyboard 5 words. Add them into a string list and display them to the screen in reverse order.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
            strings.add(reader.readLine());
        reader.close();
        Collections.reverse(strings);
        for (String s: strings) System.out.println(s);
    }
}
