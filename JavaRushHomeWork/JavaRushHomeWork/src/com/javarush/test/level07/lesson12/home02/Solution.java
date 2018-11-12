package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Move first M lines to the end of the list
Read from the keyboard 2 numbers: N and M.
    Read from keyboard N strings and fill a list with them.
    Move first M lines to the end of the list
    Display to the screen the list. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < M; i++)
            list.add(reader.readLine());
        for (int i = 0; i < N - M; i++)
            list.add(i, reader.readLine());
        for (String s: list)
            System.out.println(s);
        reader.close();

    }
}
