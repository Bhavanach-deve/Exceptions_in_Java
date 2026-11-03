package Basics.TryCatch;

public class FinallyBlockExceptionOccured
{
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("Cleanup happens");
        }

        System.out.println("Program continues");
    }
}
