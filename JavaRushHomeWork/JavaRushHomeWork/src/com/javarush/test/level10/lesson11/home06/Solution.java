package com.javarush.test.level10.lesson11.home06;

/* Constructors of the class Human
Write a class Human with 6 fields. Come up with 10 different constructors for it and implement them. Each constructor should have meaning.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String firstName;
        String lastName;
        int age;
        String passportSeries;
        boolean sex;
        String city;

        public Human()
        {
            this.firstName = "unknown";
            this.lastName = "unknown";
            this.age = -1;
            this.passportSeries = "unknown";
            this.sex = false;
            this.city = "unknown";
        }

        public Human(String firstName)
        {
            this.firstName = firstName;
            this.lastName = "unknown";
            this.age = -1;
            this.passportSeries = "unknown";
            this.sex = false;
            this.city = "unknown";
        }

        public Human(String firstName, String lastName)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = -1;
            this.passportSeries = "unknown";
            this.sex = false;
            this.city = "unknown";
        }

        public Human(String firstName, String lastName, int age)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.passportSeries = "unknown";
            this.sex = false;
            this.city = "unknown";
        }

        public Human(String firstName, String lastName, int age, String passportSeries)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.passportSeries = passportSeries;
            this.sex = false;
            this.city = "unknown";
        }

        public Human(String firstName, String lastName, int age, String passportSeries, boolean sex)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.passportSeries = passportSeries;
            this.sex = sex;
            this.city = "unknown";
        }

        public Human(String firstName, String lastName, int age, String passportSeries, boolean sex, String city)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.passportSeries = passportSeries;
            this.sex = sex;
            this.city = city;
        }

        public Human(String firstName, String lastName, int age, boolean sex, String city)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.passportSeries = "unknown";
            this.sex = sex;
            this.city = city;
        }

        public Human(String firstName, String lastName, boolean sex)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = -1;
            this.passportSeries = "unknown";
            this.sex = sex;
            this.city = "unknown";
        }

        public Human(String firstName, String lastName, int age, boolean sex)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.passportSeries = "unknown";
            this.sex = sex;
            this.city = "unknown";
        }
    }
}
