package com.javarush.test.level09.lesson11.home01;

/* Division by zero
Create a method public static void divisionByZero(), where you need to divide any number by zero, and display to the screen the result of the division.
    Wrap the divisionByZero() method call into a try..catch. Display to the screen the exception stack trace using the method exception.printStackTrace().
*/

public class Solution {

    public static void main(String[] args) {
        divisionByZero();
    }

    public static void divisionByZero(){
        try
        {
            System.out.println(13 / 0);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
