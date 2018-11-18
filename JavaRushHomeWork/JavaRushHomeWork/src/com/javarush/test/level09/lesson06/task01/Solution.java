package com.javarush.test.level09.lesson06.task01;

/* Exception when operating with numbers
Catch the exception that occurs when run the code:
    int a = 42 / 0;
    Display the exception to the screen, specifying its type.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            int a = 42 / 0;
        }
        catch (ArithmeticException  e)
        {
            System.out.println("ArithmeticException");
        }

    }
}
