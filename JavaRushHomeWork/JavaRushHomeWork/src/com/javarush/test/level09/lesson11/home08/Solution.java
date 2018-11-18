package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* List of arrays of numbers
Create a list whose elements are arrays of numbers. Add to the list five object arrays with length 5, 2, 4, 7, 0, respectively.
    Fill arrays with any data and display them on the screen.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]>list = new ArrayList<int[]>();

        int[] a = {1, 2, 3, 4, 5};
        list.add(a);
        int[] b = {1, 2};
        list.add(b);
        int[] c = {1, 2, 3, 4};
        list.add(c);
        int[] d = {1, 2, 3, 4, 5, 6, 7};
        list.add(d);
        int[] e = new int[0];
        list.add(e);

        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
