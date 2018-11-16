package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;

/* 20 words beginning with «L»
Create a set of strings (Set<String>), place into it 20 words beginning with «L».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++){
            set.add("L" + i);
        }
        return set;
    }
}
