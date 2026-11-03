package Basics;
//What is an exception?
//An exception is an event that interrupts the normal flow of a program while it is running.
public class Main
{
    public static void main(String[] args)
    {
        int result=10/0;
        System.out.println(result);
        System.out.println("Program finished.");

    }
}
//Java throws an ArithmeticException because integer division by zero is not allowed. The later statements don't execute because the exception is not handled.
//Why does exception handling matter? It allows us to respond to errors in a controlled way rather than letting an unexpected failure interrupt normal program execution unnecessarily.