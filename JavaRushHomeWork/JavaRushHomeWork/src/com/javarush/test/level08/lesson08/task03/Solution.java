package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Identical first and last names
Create a dictionary (Map<String, String>) and add ten entries according to the model «last name» - «first name».
    Check how many people have the same first or last name as the name specified.
*/
public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();

        System.out.println(getCountTheSameFirstName(map, "Vasilij"));
        System.out.println(getCountTheSameLastName(map, "Ivanov"));
    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> people = new HashMap<String, String>();

        people.put("Ivanov", "Petr");
        people.put("Petrov", "Vasilij");
        people.put("Sidorov", "Sergey");
        people.put("Smirnov", "Pyotr");
        people.put("Nemiroff", "Vasilij");
        people.put("Ivanova", "Sofia");
        people.put("Macalan", "John");
        people.put("Smirnoff", "Vovochka");
        people.put("Jameson", "John");
        people.put("Napoleone", "Buonaparte");

        return people;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String value = pair.getValue();
            if (name.equals(value))
            {
                count++;
            }
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        return map.containsKey(familiya) ? 1 : 0;
    }
}
/*
public class Solution
{

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Pavlovsky", "Ivan");
        map.put("Taranov", "Ivan");
        map.put("Stakhov", "Dmytro");
        map.put("Bidnyk", "Alina");
        map.put("Kulishova", "Katya");
        map.put("Zaletsky", "Eugen");
        map.put("Kasperunas", "Igor");
        map.put("Romanyta", "Maxim");
        map.put("Stecenko", "Nikita");
        map.put("Zubakin", "Maxim");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            String value = pair.getValue();
            if (name.equals(value))
            {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            String key = pair.getKey();
            if (familiya.equals(key))
            {
                count++;
            }
        }
        return count;
    }
}
*/