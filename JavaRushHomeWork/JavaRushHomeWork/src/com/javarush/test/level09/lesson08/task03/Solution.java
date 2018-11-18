package com.javarush.test.level09.lesson08.task03;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* Catching selective exceptions
1. Find out what exceptions are thrown by the method BEAN.methodThrowExceptions.
    2. The method processExceptions() should call the method BEAN.methodThrowExceptions and handle exceptions:
    2.1. if an exception FileSystemException occurs, then log it by calling the method BEAN.log and throw forward
    2.2. if an exception CharConversionException or any other IOException occurs, just log it by calling the method BEAN.log
    3. Add the class/type of the exception you are forwarding  in 2.1. to the processExceptions() method signature.
    4. Handle the remaining exception in the method main() and log it. Use try..catch

    Tip:
    If you caught the exception MyException, which you didn’t want to catch, you can throw it forward using the following code:
    catch (MyException e) {
    throw e;
    }
*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try {
            processExceptions();
        }
        catch(FileSystemException e) {
            BEAN.log(e);
        }
    }

    public static void processExceptions() throws FileSystemException
    {
        try {
            BEAN.methodThrowExceptions();
        }
        catch (FileSystemException e) {
            BEAN.log(e);
            throw e;
        }
        catch (IOException e) {
            BEAN.log(e);
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}
