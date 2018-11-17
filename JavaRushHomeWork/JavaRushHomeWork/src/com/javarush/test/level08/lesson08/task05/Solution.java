package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Remove people having the same first name
Create a dictionary (Map<String, String>) and add ten entries according to the model «last name» - «first name».
    Remove people that have the same first name.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String,String> mappa = createMap();
        for (Map.Entry<String, String> pair: mappa.entrySet())
            System.out.println(pair.getKey() + " " + pair.getValue());
        System.out.println("-------------------------------");
        removeTheFirstNameDuplicates(mappa);
        for (Map.Entry<String, String> pair: mappa.entrySet())
            System.out.println(pair.getKey() + " " + pair.getValue());
    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Ivan");
        map.put("Sidorov", "Sasha");
        map.put("Kovalev", "Ivan");
        map.put("Lysenko", "Vasyl");
        map.put("Razumovsky", "Petro");
        map.put("Rohachov", "Maxim");
        map.put("Kior", "Nikita");
        map.put("Pugachev", "Maxim");
        map.put("Ponomarenko", "Pavlo");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, Integer> names = new HashMap<>();
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            if (names.containsKey(pair.getValue())) names.put(pair.getValue(), names.get(pair.getValue()) + 1);
            else names.put(pair.getValue(), 1);
        }
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair: copy.entrySet()){
            if (names.get(pair.getValue()) > 1)
            {
                map.remove(pair.getKey());
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
