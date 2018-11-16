package com.javarush.test.level08.lesson08.task04;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Remove all the people born in the summer
Create a dictionary (Map<String, Date>) and add ten entries according to the model «last mane» - «birth date».
    Remove from the map all the people born in the summer.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Fisrt", new Date("JUNE 1 1980"));
        map.put("Second", new Date("JUNE 2 1980"));
        map.put("Third", new Date("JULY 3 1980"));
        map.put("Fourth", new Date("MAY 4 1980"));
        map.put("Fifth", new Date("JUNE 1 1980"));
        map.put("Sixth", new Date("APRIL 1 1980"));
        map.put("Seventh", new Date("JUNE 1 1980"));
        map.put("Eightth", new Date("AUGUST 1 1980"));
        map.put("Ninth", new Date("DECEMBER 1 1980"));
        map.put("Tenth", new Date("OCTOBER 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        ArrayList<String> names = new ArrayList<String>();
        for (Map.Entry<String, Date> pair: map.entrySet()) {
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) names.add(pair.getKey());
        }

        for (String key: names) map.remove(key);

    }
}
