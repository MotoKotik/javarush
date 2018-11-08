package com.javarush.test.level01.lesson04.task02;

import java.lang.String;

/* I don't get excited by money, they soothe me
Write a program that displays «I don't get excited by money, they soothe me.» 10 times.
*/
public class Solution
{
    public static void main(String[] args)
    {
        print5Times("I don't get excited by money, they soothe me.");
        print5Times("I don't get excited by money, they soothe me.");
    }


    public static void print5Times(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}