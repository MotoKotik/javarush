package com.javarush.test.level09.lesson11.bonus02;

import java.io.*;

/* Add new functionality to the program.
Old task: The program should read from the keyboard two file names and to copy the first file to the location specified by the second name.
    New task: The program should read from the keyboard two file names and to copy the first file to the location specified by the second name.
    If the file (that is going to be copied) with the specified name doesn’t exist, the program should display to the screen the message «File does not exist» and try to read the file name from the console once again before reading the name of second (destination) file.
*/
/*!!! Needs dot after "File does not exist", but it isn't mentioned in the task*/
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream;
        while (true)
        {
            try
            {
                String sourceFileName = reader.readLine();
                fileInputStream = new FileInputStream(sourceFileName);
                break;
            }
            catch (FileNotFoundException fileEx)
            {
                System.out.println("File does not exist.");
            }
        }
        String destinationFileName = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
