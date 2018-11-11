package com.javarush.test.level07.lesson06.task01;

/* 5 different strings in a list
1. Create a list of strings.
    2. Add 5 different strings to the list.
    3. Display to the screen its size.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> list = new ArrayList<>();
        list.add("meow");
        list.add("sh");
        list.add("roar");
        list.add("purr");
        list.add("nya");
        System.out.println(list.size());
        for (String s: list)
            System.out.println(s);

    }
}
