package com.javarush.test.level02.lesson08.task06;

/* Text display
Write a function that displays the passed string (word) three times in the same line.
    Words must be separated by a space and don't have to merge into one.
*/
public class Solution
{
    public static void print3(String s)
    {
        System.out.println(s + " " + s + " " + s);

    }
    public static void main(String[] args)
    {
        print3("window");
        print3(" file");
    }
}