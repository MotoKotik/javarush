package com.javarush.test.level07.lesson06.task03;

/* 5 lines in reverse order
1. Create a list of strings.
    2. Read 5 strings from keyboard, then add them to the list.
    3. Arrange them in reverse order.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        for (int i = list.size() - 1 ; i >= 0; i--){
            System.out.println(list.get(i));
        }


    }
}
