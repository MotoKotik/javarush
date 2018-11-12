package com.javarush.test.level07.lesson12.home06;

/* Family
Create a class Human with the fields: String name, boolean sex, int age, Human father, Human mother. Create 9 objects of Human class and fill them in such a way as to obtain two grandfathers, two grandmothers, a father, a mother, and three children. Display to the screen the objects to the screen.
    Tip:
    If you write your method String toString() in the class Human, then it’ll be used to display an object.
    Example output:
    Name: Anna, sex: female, age: 21, father: Paul, mother: Kate
    Name: Kate, sex: female, age: 55
    Name: Ian, sex: male, age: 2, father: Michael, mother: Anna
    …
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grDad1 = new Human("Tolik", true, 65, null, null);
        Human grDad2 = new Human("Sasha", true, 70, null, null);
        Human grMom1 = new Human("Luda", false, 60, null, null);
        Human grMom2 = new Human("Nina", false, 63, null, null);
        Human dad = new Human("Sasha", true, 43, grDad1, grMom1);
        Human mom = new Human("Natasha", false, 41, grDad2, grMom2);
        Human kid1 = new Human("Alina", false, 15, dad, mom);
        Human kid2 = new Human("Alice", false, 18, dad, mom);
        Human kid3 = new Human("Irina", false, 21, dad, mom);

        System.out.println(grDad1);
        System.out.println(grDad2);
        System.out.println(grMom1);
        System.out.println(grMom2);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public String toString()
        {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }

}
