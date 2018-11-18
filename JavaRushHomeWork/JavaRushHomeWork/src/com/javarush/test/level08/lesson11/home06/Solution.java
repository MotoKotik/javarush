package com.javarush.test.level08.lesson11.home06;

/* The whole family is together
Create a class Human with the fields: String name, boolean sex, int age, ArrayList<Human> children.
    2. Create 9 objects and fill them in such a way as to obtain two grandfathers, two grandmothers, a father, a mother, and three children.
    3. Display to the screen all the Human objects.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human son1 = new Human("son Nick", true, 5, new ArrayList<Human>());
        Human son2 = new Human("son Mike", true, 12, new ArrayList<Human>());
        Human daughter1 = new Human("daughter Kate", false, 18, new ArrayList<Human>());
        ArrayList<Human> children = new ArrayList<>();
        children.add(son1);
        children.add(son2);
        children.add(daughter1);

        Human dad = new Human("dad John", true, 45, children);
        Human mom = new Human("mom Jane", false, 39, children);
        ArrayList<Human> elderChildrenDad = new ArrayList<>();
        ArrayList<Human> elderChildrenMom = new ArrayList<>();
        elderChildrenDad.add(dad);
        elderChildrenMom.add(mom);

        Human grDad1 = new Human("grandad Barry", true, 70, elderChildrenDad);
        Human grMom1 = new Human("grandmom Alice", false, 65, elderChildrenDad);
        Human grDad2 = new Human("grandad Bruce", true, 70, elderChildrenMom);
        Human grMom2 = new Human("grandmom Laura", false, 65, elderChildrenMom);

        System.out.println(grDad1.toString());
        System.out.println(grDad2.toString());
        System.out.println(grMom1.toString());
        System.out.println(grMom2.toString());
        System.out.println(dad.toString());
        System.out.println(mom.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter1.toString());
    }


    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>(children);
        }

        public String toString()
        {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", children: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
