package com.javarush.test.level03.lesson06.task04;

/* Escape character
Read about escape character in Java in additional material to the lecture.

    Write a program that displays following two strings:
    It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
    It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");

    }
}