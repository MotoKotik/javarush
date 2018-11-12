package com.javarush.test.level07.lesson12.home07;

/* Move one modifier static
Move one static modifier so the program compile.
*/

public class Solution
{
    public final static int A = 5;
    public final static int B = 2;
    public final static int C = A*B;

    public static void main(String[] args)
    {
    }

    public int getValue()
    {
        return C;
    }

}

