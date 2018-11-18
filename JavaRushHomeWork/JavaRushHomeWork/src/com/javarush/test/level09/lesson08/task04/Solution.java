package com.javarush.test.level09.lesson08.task04;

import java.io.IOException;
import java.rmi.RemoteException;

/* Catching checked exceptions
Handle all the checked exceptions in the method processExceptions().
    You need to display to the screen each checked exception that has occurred.
    You may use only one block try.
*/

public class Solution {
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
        catch (RemoteException ex3){
            System.out.println(ex3);
        }
        catch (NoSuchFieldException ex1)
        {
            System.out.println(ex1);
        }
        catch (IOException ex2)
        {
            System.out.println(ex2);
        }

    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
