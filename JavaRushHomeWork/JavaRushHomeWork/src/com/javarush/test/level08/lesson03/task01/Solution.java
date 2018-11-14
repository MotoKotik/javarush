package com.javarush.test.level08.lesson03.task01;

/* A plant HashSet
Create a HashSet collection of String type elements.
    Add to the collection 10 strings: watermelon, banana, cherry, pear, melon, blackberry, ginseng, strawberry, iris, and potato.
    Display to the screen the contents of the collection. Each entry should be on a new line.
    Watch how changed the order of added elements.
*/

import java.util.HashSet;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashSet<String> elements = new HashSet<>();
        elements.add("watermelon");
        elements.add("banana");
        elements.add("cherry");
        elements.add("pear");
        elements.add("melon");
        elements.add("blackberry");
        elements.add("ginseng");
        elements.add("strawberry");
        elements.add("iris");
        elements.add("potato");

        for (String s: elements)
            System.out.println(s);
    }
}
