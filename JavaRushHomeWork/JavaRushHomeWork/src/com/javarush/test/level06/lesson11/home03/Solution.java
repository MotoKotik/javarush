package com.javarush.test.level06.lesson11.home03;

/* Move one static modifier
Move one static modifier so the code compiles.
*/

public class Solution
{

    public static int A = 5;
    public int B = 2;
    public int C = A*B;

    public static void main(String[] args)
    {
        A = 15;
    }

}

