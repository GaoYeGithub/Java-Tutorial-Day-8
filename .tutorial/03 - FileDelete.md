# Deleting Files

There no special modules for deleting a file you just need

```java
import java.io.File;
```
Like this!

```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
```



### You are on your way to being a coder in no time!
