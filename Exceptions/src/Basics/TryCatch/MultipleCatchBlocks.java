package Basics.TryCatch;

import java.io.IOException;

public class MultipleCatchBlocks
{
    public static void main(String[] args) throws IOException
    {
        try{
            int number=Integer.parseInt("hello");
            int result=10/number;
            System.out.println(result);
        }catch(NumberFormatException e){
            System.out.println("Please provide a valid number");
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero.");
        }
        System.out.println("Program continues.");
    }
}
//Why doesn't the arithmetic handler run? Integer.parseInt("hello") throws NumberFormatException first. The remaining statements in try are skipped, so the division never happens.
//When you use multiple catch blocks, put more specific exception types before more general parent types.