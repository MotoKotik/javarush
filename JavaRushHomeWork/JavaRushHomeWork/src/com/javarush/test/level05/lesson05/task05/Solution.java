package com.javarush.test.level05.lesson05.task05;

/* Hold three twosome fights between cats
Create three cats using the class Cat.
    Hold three pairwise fights between cats.
    Do not create the class Cat. For the fight, use the method boolean fight(Cat anotherCat).
    Display the result of each fight.
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vulcan", 6, 2, 3);
        Cat cat2 = new Cat("Honda", 10, 3, 6);
        Cat cat3 = new Cat("Kanya", 15, 5, 10);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
