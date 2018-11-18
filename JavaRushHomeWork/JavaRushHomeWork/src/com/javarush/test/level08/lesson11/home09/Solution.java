package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Working with date
1. Implement the method isDateOdd(String date) so that it returns true, if the number of days from the beginning of the year is odd, otherwise it returns false.
    2. String date is passed in the format MAY 1 2013

    JANUARY 1 2000 = true
    JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 1 200"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date){
        Date currentDate = new Date(date);
        Date startDate = new Date(date);
        startDate.setHours(0);
        startDate.setMinutes(0);
        startDate.setSeconds(0);
        startDate.setDate(1);
        startDate.setMonth(0);

        long d = currentDate.getTime() - startDate.getTime();
        long ms = 1000 * 60 * 60 * 24;

        int dayCount = (int)(d / ms);
        return  (dayCount % 2 == 0);

    }
}
