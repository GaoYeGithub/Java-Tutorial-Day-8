import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Note Taking App");
            System.out.println("1. Create a new note");
            System.out.println("2. Read an existing note");
            System.out.println("3. Append to an existing note");
            System.out.println("4. Delete a note");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createNote(scanner);
                    break;
                case 2:
                    readNote(scanner);
                    break;
                case 3:
                    appendNote(scanner);
                    break;
                case 4:
                    deleteNote(scanner);
                    break;
                case 5:
                    System.exit(0);
                    scanner.close();
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void createNote(Scanner scanner) {
        System.out.print("Enter the name of the note: ");
        String noteName = scanner.nextLine();
        try {
            File file = new File(noteName + ".txt");
            if (file.createNewFile()) {
                System.out.println("Note created: " + file.getName());
                System.out.print("Enter the content of the note: ");
                String content = scanner.nextLine();
                FileWriter writer = new FileWriter(file);
                writer.write(content);
                writer.close();
                System.out.println("Recorded.");
            } else {
                System.out.println("Note already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readNote (Scanner scanner) {
        System.out.print("Enter the name of the note to read: ");
        String noteName = scanner.nextLine();
        try {
            File file = new File(noteName + ".txt");
            if (file.exists()) {
                Scanner reader = new Scanner(file);
                while (reader.hasNextLine()) {
                    String info = reader.nextLine();
                    System.out.println(info);
                }
                reader.close();
            } else {
                System.out.println("Note does not exist.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void appendNote (Scanner scanner) {
        System.out.print("Enter the name of the note to append to: ");
        String noteName = scanner.nextLine();
        try {
            File file = new File(noteName + ".txt");
            if (file.exists()) {
                FileWriter writer = new FileWriter(file, true);
                System.out.print("Enter the content to append: ");
                String content = scanner.nextLine();
                writer.write("\n" + content);
                writer.close();
                System.out.println("Added");
            } else {
                System.out.println("Note does not exist.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void deleteNote (Scanner scanner) {
        System.out.print("Enter the name of the note to delete: ");
        String noteName = scanner.nextLine();
        File file = new File(noteName + ".txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Deleted: " + file.getName());
            } else {
                System.out.println("Failed to delete the note.");
            }
        } else {
            System.out.println("Note does not exist.");
        }
    }
}
