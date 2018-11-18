package com.javarush.test.level10.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Identical words in the list
Read from the keyboard 20 words, fill a list with them. Count the number of identical words in the list. Result should be a Map<String, Integer>.
    The key of the map should be a unique string, the value - count of this string in the list.
    Display to the screen contents of the map.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++)
        {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list)
    {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        for (String s : list){
            if (result.containsKey(s)) result.put(s, result.get(s) + 1);
            else result.put(s, 1);
        }


        return result;
    }

}
