 package com.javarush.test.level10.lesson11.home10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Five largest numbers
Create a list of integers. Read 20 integers from the keyboard and fill a list with them. Create a method to extract numbers from the list safely:
    int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
    The method should return an element of the list by its index. If an exception occurs in this method, you need to catch it, and return the defaultValue.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++)
        {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
    {
      try
      {
          return list.get(index);
      }
      catch (Exception e)
      {
          return defaultValue;
      }
    }

}
