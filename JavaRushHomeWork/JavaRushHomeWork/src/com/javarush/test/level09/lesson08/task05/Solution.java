package com.javarush.test.level09.lesson08.task05;

/* Catching unchecked exceptions
Handle all the unchecked exceptions in the method processExceptions().
    You need to display to the screen a stack trace of each occurred exception using the method printStack().
    You may use only one block try.
*/

public class Solution
{
    public static void main(String[] args) {
        processExceptions(new Solution());
    }

    public static void processExceptions(Solution obj) {
        try
        {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (Exception ex){
            printStack(ex);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1(){
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
