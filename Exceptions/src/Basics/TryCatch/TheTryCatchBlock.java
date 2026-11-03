package Basics.TryCatch;

public class TheTryCatchBlock
{
    public static void main(String[] args)
    {
        try{
            int result=10/0;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Program continues...");
    }
}
//try block
//Code that might throw an exception
//
//Exception occurs
//
//catch block
//Handles a matching exception type
//
//After handling
//
//Next statement
//Execution continues after the try-catch
//try-catch doesn't prevent the exception from occurring. It provides a way to handle it.
