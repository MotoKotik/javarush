package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Remove all the numbers greater than 10
Create a set of numbers (Set<Integer>), place into it 20 different numbers.
    Remove from the set all the numbers greater than 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 20; i++)
            numbers.add(i*3);
        return numbers;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            if (iterator.next()>10) iterator.remove();
        }

        return set;
    }
}
