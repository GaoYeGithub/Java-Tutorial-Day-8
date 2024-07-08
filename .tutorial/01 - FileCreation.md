 # Java Files

First in order to handle files you need the following 

```java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
```

Now the rest of the code that create a file and writes in it

```java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a file
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write to the file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a file handling example.\n");
            writer.write("We are writing to the file.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```