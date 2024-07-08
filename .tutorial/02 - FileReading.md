# Reading a File

We will be useing the following modules.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
```
To use it do this

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```
If everything works as expected your console should now show you what in your file!

