package com.javarush.test.level10.lesson04.task03;

/* Type cast and conversation task #3
Put cast operator where needed:
    float f = 333.50;
    int i = f;
    byte b = i;
*/

public class Solution
{
    public static void main(String[] args)
    {
        float f = (float) 333.50;
        int i= (int) f;
        byte b = (byte) i;
    }
}
