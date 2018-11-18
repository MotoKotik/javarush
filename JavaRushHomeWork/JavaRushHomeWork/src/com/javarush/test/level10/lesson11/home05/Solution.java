package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* The number of letters
Read from the keyboard 10 strings and count the number of different letters in them (for all 26 letters of the alphabet). Display the result to the screen.
    Example output:
    a 5
    b 8
    c 3
    d 7
    …
    z 9
*/


public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String abc = "abcdefghijklnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int abcCount = 0;
        for ( char x : alphabet)
        {
            for ( String y : list)
            {
                for (char z : y.toCharArray())
                {
                    if ( x == z )
                        abcCount++;
                }
            }
            System.out.println(x + " " + abcCount);
            abcCount = 0;
        }
    }

}
/*===============================  MY SOLUTION
public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //ABC
        String abc = "abcdefghijklnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        Map<Character, Integer> alphabet = new HashMap<>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.put(abcArray[i], 0);
        }

        //String reading
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        for (String s : list){
            for (Character ch : s.toCharArray())
            {
                if (alphabet.containsKey(ch))
                    alphabet.put(ch, alphabet.get(ch) + 1);
            }
        }
        for (Map.Entry<Character, Integer> pair : alphabet.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
*/