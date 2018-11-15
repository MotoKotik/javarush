package com.javarush.test.level08.lesson03.task02;

/* HashMap of 10 pairs
Create a collection HashMap<String, String>, place 10 pairs of strings into the collection:
    watermelon - berry, banana - grass, cherry - berry, pear - fruit, melon - vegetable, blackberry - berry, ginseng - root, strawberry - berry, iris - flower, potato - tuber.
    Display to the screen the contents of the collection. Each entry should be on a new line.

    Output example (only one string is shown):
    potato - tuber
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Map<String, String> map = new HashMap<>();
        map.put("watermelon", "berry");
        map.put("banana", "grass");
        map.put("cherry", "berry");
        map.put("pear", "fruit");
        map.put("melon", "vegetable");
        map.put("blackberry", "berry");
        map.put("ginseng", "root");
        map.put("strawberry", "berry");
        map.put("iris", "flower");
        map.put("potato", "tuber");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
