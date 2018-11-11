package com.javarush.test.level05.lesson12.home01;

/* Three classes
1. Create class Cat and Dog by analogy with the class Duck.
    2. Think of what the toString method should return in the classes Cat and Dog.
    3. In the method main create two objects in each class and display them.
    4. The Duck class objects are created and displaying.
*/

public class Solution
{

    public static void main(String[] args)
    {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);
    }

    public static class Duck
    {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat
    {
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog
    {
        public String toString() {
            return "Dog";
        }
    }

}
