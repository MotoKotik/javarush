package com.javarush.test.level04.lesson02.task04;

/* Implement method setName()
Implement the setName method, so the value of the private String fullName variable would be equal to the String fullName local variable value.
*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        this.fullName = fullName;
    }
}
