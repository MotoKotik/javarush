package com.javarush.test.level09.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/* Program doesn’t compile and run. Fix it.
Task: The program should read from the keyboard two file names and copy the first file to the location specified by the second name.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(new File(sourceFileName));
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(new File(destinationFileName));

        int count = 0;
        while (fileInputStream.available()>0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("Bytes copied " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }
}
