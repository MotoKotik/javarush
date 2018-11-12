package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* The word «here»
1. Create a list of the words «stop», «look», «listen».
    2. Add a string containing «here» after each word.
    3. Display the result. Each element of list should be on a new line. Use “for” loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> words = new ArrayList<>();
        words.add("stop");
        words.add("look");
        words.add("listen");
        for (int i = 1; i <= 5; i += 2) words.add(i, "here");
        for (String w: words) System.out.println(w);

    }
}
