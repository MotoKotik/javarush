package com.javarush.test.level10.lesson11.home04;

/* Big salary
Display to the screen the message «I don't want to study Java, I want a big salary» 40 times following the example.
    Example:
    I do not want to learn Java, I want a big salary
    do not want to learn Java, I want a big salary
    do not want to learn Java, I want a big salary
    o not want to learn Java, I want a big salary
    not want to learn Java, I want a big salary
    not want to learn Java, I want a big salary
    …
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s = "I do not want to learn Java, I want a big salary";

        for (int i = 0; i < 40; i++) {
            System.out.println(s.substring(i));
        }
    }

}
