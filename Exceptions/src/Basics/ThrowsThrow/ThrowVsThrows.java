package Basics.ThrowsThrow;

import java.io.IOException;

public class ThrowVsThrows
{
    static void readFile()throws IOException
    {
        throw new IOException("Unable to read from file");
    }

    public static void main(String[] args)
    {
        try
        {
            readFile();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
