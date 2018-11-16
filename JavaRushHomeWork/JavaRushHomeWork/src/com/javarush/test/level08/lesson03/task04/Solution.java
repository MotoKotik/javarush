package com.javarush.test.level08.lesson03.task04;

import java.util.HashMap;
import java.util.Map;

/* Display to the screen the list of keys
There is a collection HashMap<String, String>, it already has 10 different strings.
    Display to the screen the list of keys. Each entry should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map)
    {
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            System.out.println(pair.getKey());
        }
    }
}
