package com.javarush.test.level06.lesson11.home05;

/* Any new ideas? Let’s think...
1) Write a public static class Idea in the class Solution
    2) Write a method public String getDescription() in the class Idea to return any non-empty message
    3) In the class Solution create a static method public void printIdea(Idea idea) to display a description of the idea - that’s what the method getDescription() returns
*/

public class Solution
{
    public static void main(String[] args)
    {
        printIdea(new Idea());
    }

    public static class Idea{
        String getDescription(){
            return "Let's meow!";
        }
    }
    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }
}
