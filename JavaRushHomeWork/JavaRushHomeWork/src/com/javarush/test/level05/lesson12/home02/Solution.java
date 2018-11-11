package com.javarush.test.level05.lesson12.home02;

/* A Man and A Woman
1. Create public static classes Man and Woman within the class Solution.
    2. Classes must have fields: name(String), age(int), address(String).
    3. Create constructors to pass all the possible parameters to.
    4. Use the constructor to create two objects of each class with all the data.
    5. Display the objects in format [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Woman w1 = new Woman("Anna", 19, "Miru ave, 74");
        Woman w2 = new Woman("Kate", 25, "Metalluhiv ave, 102");
        Man m1 = new Man("Sergo", 23, "Metalluhiv ave, 102");
        Man m2 = new Man("Alex", 30, "Budivelnikiv, 15");

        System.out.println(w1.name + " " + w1.age + " " + w1.address);
        System.out.println(w2.name + " " + w2.age + " " + w2.address);
        System.out.println(m1.name + " " + m1.age + " " + m1.address);
        System.out.println(m2.name + " " + m2.age + " " + m2.address);
    }

    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(){
        }
        public Man(String name){
            this.name = name;
        }
        public Man(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(){
        }
        public Woman(String name){
            this.name = name;
        }
        public Woman(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
