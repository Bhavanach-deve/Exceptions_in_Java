package Basics.CheckedVsUncheckedExceptions;

import java.io.IOException;

public class CheckedExceptions
{
    static void readFile()throws IOException {
        throw new IOException("File read failed");
    }
    public static void main(String[] args) {
        try{
            readFile();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
