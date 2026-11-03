# Checked vs. unchecked exceptions

Checked exception: An exception type that the Java compiler requires you to account for using a catch block or a throws declaration, subject to Java's exception-handling rules.

Unchecked exception: An exception type that the compiler does not require you to catch or declare.

The key difference is not whether the exception actually occurs. The key difference is whether the Java compiler enforces handling or declaration of that exception.

##### Who checks them?
The Java compiler checks checked-exception rules when you compile your source code. It doesn't run your application to see whether the exception will actually happen.

At runtime, the JVM executes your program and exception objects can be thrown. A matching catch block can handle an exception; otherwise, it can propagate up the call stack.

##### Checked exception example
What happens?
- At compile time, Java requires the potentially escaping IOException to be caught or declared.
- At runtime, the method throws the exception.
- The matching catch handles it and prints File read failed.

**Compare that with an unchecked exception:**
Java allows this code to compile without requiring a catch or throws declaration for ArithmeticException. At runtime, the division throws the exception.

##### Why are they called “checked” and “unchecked”?
**Checked Exception**
The compiler checks your handling

If a checked exception can escape a method, you must catch it or declare it with throws.

Without a suitable catch or throws declaration, code that triggers a checked-exception requirement won't compile.

**Unchecked Exception**
The compiler doesn't require a declaration

You can write code that might throw a RuntimeException without catching or declaring it.
