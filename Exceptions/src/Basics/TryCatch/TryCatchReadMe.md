# **try-catch Block**

##### try block

Code that might throw an exception

Exception occurs

##### catch block

Handles a matching exception type

After handling

##### Next statement

Execution continues after the try-catch

##### The key rules:
- try contains code where an exception might occur.
- catch handles an exception whose type matches the thrown exception.
- When an exception occurs inside try, the remaining statements in that try block are skipped.
- After a matching catch finishes, execution normally continues after the entire try-catch structure.
  Captain's important distinction: try-catch doesn't prevent the exception from occurring. It provides a way to handle it.

##### What exactly is ArithmeticException?

Consider this code:

**int result = 10 / 0;**
Java integer division by zero causes an ArithmeticException.

**Why is it called a class?**
ArithmeticException is a class provided by Java in the java.lang package. It represents an exceptional arithmetic condition.

public class Main {
public static void main(String[] args) {
try {
int result = 10 / 0;
System.out.println(result);
} catch (ArithmeticException e) {
System.out.println("Problem: " + e.getMessage());
}
}
}
**Here, Java creates and throws an exception object when the division is attempted. The matching catch receives a reference to that object.**

| Type               |Example|Checked or Unchecked|
|--------------------|-------|----------------------|
| Runtime exceptions |ArithmeticException, NullPointerException, IllegalArgumentException|Unchecked|
|Other Exceptions|IOException, SQLException, ClassNotFoundException|Checked|
|Errors|OutOfMemoryError, StackOverflowError|Unchecked

---------------------------------------------------------------
**The difference between Exception and RuntimeException**

// Checked exception
**throw new IOException("File could not be read");**

// Unchecked exception
**throw new IllegalArgumentException("Age cannot be negative");**

The first example needs an appropriate catch or a throws IOException declaration if it is allowed to escape the method. The second does not require that declaration because IllegalArgumentException is unchecked.