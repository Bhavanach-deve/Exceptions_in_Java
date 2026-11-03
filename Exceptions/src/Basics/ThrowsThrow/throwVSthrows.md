# throw vs. throws

These two look similar, but they serve different purposes.
**throw — actually throws an exception**
You use throw followed by an exception object.
throw new IllegalArgumentException(
"Age cannot be negative"
);


This creates and throws an exception object. Normal execution in that block stops unless the exception is caught.

**throws — declares a possibility**
You use throws in a method declaration to indicate exception types that may propagate to the caller.
void readBooks() throws IOException {
// File-reading logic
}

This declaration does not itself throw an exception. The method's code may throw one, and callers must handle or declare a checked exception when required.
Here:
1. throws IOException declares the checked exception.
2. throw new IOException(...) actually throws it.
3. The caller catches it using catch (IOException e).