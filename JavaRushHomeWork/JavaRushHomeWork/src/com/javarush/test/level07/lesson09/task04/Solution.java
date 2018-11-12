package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Letters «r» and «l»
1. Create a list of words/strings, fill it with whatever you want.
    2. The method fix() should:
    2.1. delete all the words containing letter «r» from the list of strings
    2.2. double all the words containing letter «l».
    2.3. leave the word unchanged if it contains both letters «r» and «l».
    2.4. don’t do anything with other words.

    Example:
    rose
    willow
    lyre
    oak

    Output data:
    willow
    willow
    lyre
    oak
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("rose");
        list.add("willow");
        list.add("lyre");
        list.add("oak");
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        ArrayList<String> res = new ArrayList<>();
        for (String s: list){
            if (s.contains("r") && !s.contains("l")) continue;
            else if (s.contains("l") && s.contains("r")) res.add(s);
            else if (s.contains("l") && !s.contains("r")) {
                res.add(s);
                res.add(s);
            }
            else res.add(s);

        }
        return res;
    }
}