package com.javarush.test.level10.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Program doesn’t compile and run. Fix it.
Task: The program shows how HashMap works. The program reads from the keyboard a set of pairs (a number and a string), places them in a HashMap and displays to the screen the contents of HashMap.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++)
        {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : map.entrySet())
        {
            int id = pair.getKey();
            String name = pair.getValue();
            System.out.println("Id=" + id + " Name=" + name);
        }
    }

}
