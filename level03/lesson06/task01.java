package com.javarush.test.level03.lesson06.task01;

/* Stop look listen
Write a program that displays all possible combinations of words «Stop», «Look», «Listen».
    Hint: there are 6 variants. Display each combination in a new line. Do not separate words.

    Example:
    LookListenStop
    ListenStopLook
    ...
*/

public class Solution
{
    public static void main(String[] args)
    {
        String lo = "Look", st = "Stop", li = "Listen";
        System.out.println(lo + st + li);
        System.out.println(lo + li + st);
        System.out.println(li + st + lo);
        System.out.println(li + lo + st);
        System.out.println(st + lo + li);
        System.out.println(st + li + lo);

    }
}