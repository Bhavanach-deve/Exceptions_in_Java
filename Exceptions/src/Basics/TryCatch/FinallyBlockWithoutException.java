package Basics.TryCatch;
//What if we want some code to execute whether an exception occurs or not?
//The finally block is used for cleanup operations, such as releasing resources or restoring a state after a try block finishes.
public class FinallyBlockWithoutException
{
    public static void main(String[] args) {
        try {
            System.out.println("Inside try");
        } catch (ArithmeticException e) {
            System.out.println("Inside catch");
        } finally {
            System.out.println("Inside finally");
        }

        System.out.println("After try-catch-finally");
    }
}
