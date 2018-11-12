package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Three arrays
1. Read from the keyboard 20 numbers, save them in a list, then sort them into three other lists:
    List 1 stores numbers divisible by 3 (x%3==0)
    List 2 stores numbers divisible by 2 (x%2==0)
    List 3 stores the rest of numbers.
    The numbers divisible by 3 and 2 at the same time (for example 6) belong to both lists – list 1 and list 2.
    2. The method printList() should display each element of the list on a new line.
    3. Use the method printList() to display to the screen these three lists. First the list 1 should be displayed, then list 2, after that list 3.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<Integer> div2 = new ArrayList<>();
        List<Integer> div3 = new ArrayList<>();
        List<Integer> rest = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++){
            int temp = Integer.parseInt(reader.readLine());
            if (temp % 3 == 0) div3.add(temp);
            if (temp % 2 == 0) div2.add(temp);
            if (temp % 2 != 0 && temp % 3 != 0) rest.add(temp);
        }
        printList(div3);
        printList(div2);
        printList(rest);
    }

    public static void printList(List<Integer> list)
    {
        for (int x: list) System.out.println(x);
    }
}
