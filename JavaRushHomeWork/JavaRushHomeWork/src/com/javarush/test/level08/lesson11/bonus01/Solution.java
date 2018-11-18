package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Month number
The program should read from the keyboard the name of the month and display to the screen its number in following way: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        int number;
        switch (month){
            case "January": number = 1; break;
            case "February": number = 2; break;
            case "March": number = 3; break;
            case "April": number = 4; break;
            case "May": number = 5; break;
            case "June": number = 6; break;
            case "July": number = 7; break;
            case "August": number = 8; break;
            case "September": number = 9; break;
            case "October": number = 10; break;
            case "November": number = 11; break;
            case "December": number = 12; break;
            default: number = 0; break;
        }
        System.out.println(month + " is " + number + " month");
        reader.close();
    }

}
