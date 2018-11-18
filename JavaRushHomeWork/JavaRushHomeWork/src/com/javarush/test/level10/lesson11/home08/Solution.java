package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Array of string lists
Create an array whose elements are lists of strings. Fill the array with any data and display them to the screen.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] lists = new ArrayList[5];
        for (int i = 0; i < 5; i++){
            lists[i] = new ArrayList<>();
            lists[i].add("a" + i);
        }

        return lists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}