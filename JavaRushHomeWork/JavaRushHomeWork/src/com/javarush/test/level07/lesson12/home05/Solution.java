package com.javarush.test.level07.lesson12.home05;

/* Bang!
Write a program that counts down from 30 to 0, and displays «Bang!» at the end. The program should reduce the number 10 times per second. Use the function below to insert a delay:
    Thread.sleep(100); //delay of one tenth of a second.
    Example:
    30
    29
    …
    1
    0
    Bang!
*/

public class Solution
{
    public static void main(String[] args) throws InterruptedException
    {
        for (int i=30;i>=0;i--)
        {
            System.out.println(i);

            Thread.sleep(100);
        }

        System.out.println("Bang!");
    }
}
