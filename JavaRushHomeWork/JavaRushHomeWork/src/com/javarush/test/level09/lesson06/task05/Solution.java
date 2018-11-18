package com.javarush.test.level09.lesson06.task05;

import java.util.HashMap;

/* Exception when operating with Map collections
Catch the exception that occurs when run the code:
    HashMap<String, String> map = new HashMap<String, String>(null);
    map.put(null, null);
    map.remove(null);
    Display the exception to the screen, specifying its type.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
