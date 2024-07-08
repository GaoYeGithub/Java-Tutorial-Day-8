# Appending to Files

What if you want to create and add more stuff the files?

To do this just need 
```java
import java.io.FileWriter;
import java.io.IOException;
```
Like this:

```java
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Append to the file
            FileWriter writer = new FileWriter("example.txt", true);
            writer.write("\nThis line is appended to the file.");
            writer.write("\nAnother appended line.");
            writer.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

```
