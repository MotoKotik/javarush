package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* Learning and practicing algorithm.
Task: Read from the keyboard the list of words and numbers. Display to the screen words in ascending order and the numbers in descending order.

    Example input:
    Cherry
    1
    Bean
    3
    Apple
    2
    0
    Watermelon

    Example output:
    Apple
    3
    Bean
    2
    Cherry
    1
    0
    Watermelon
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        List<Integer> numbers = new ArrayList<>();
        List<String> words = new ArrayList<>();
        for (String s: array){
            if (isNumber(s)) numbers.add(Integer.parseInt(s));
            else words.add(s);
        }
        Collections.sort(words);
        Collections.sort(numbers, Collections.<Integer>reverseOrder());
        Iterator<Integer> iterNumbers = numbers.iterator();
        Iterator<String> iterWords = words.iterator();

        for (int i = 0; i < array.length; i++){
            if (isNumber(array[i]) && iterNumbers.hasNext()) array[i] = iterNumbers.next().toString();
            else if (iterWords.hasNext()) array[i] = iterWords.next();
        }
    }

    //String compare method: '?' greater then 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //Is string a number?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //Contains '-' inside string
                    || (!Character.isDigit(c) && c != '-') ) // Not a digit, does not begin with '-'
            {
                return false;
            }
        }
        return true;
    }
}
