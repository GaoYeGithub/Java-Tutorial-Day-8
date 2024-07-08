# Here is your challenge for Day 8

## Project 8: Note Taking App

Let's get started with your project! This will use everything we learn so far to make a note app.

*You can continue to use this same repl for your project. Just make sure you delete any previous code from our practice session.*

1. Create a while loop that ask the user the following use a switch case to see what int they used or if statments but that slower and more code. And exits when the user enter 5

```
Note Taking App
1. Create a new note
2. Read an existing note
3. Append to an existing note
4. Delete a note
5. Exit
```

2. Create a function if they enter 1 that create a note txt that ask the user for what they want to name the note and create it then ask them what that ask then them the content of notes like this:
```
Enter the name of the note:
test
Note created: test.txt
Enter the content of the note: 
Day 8
Recorded.
```
<details> <summary>💡 Hint </summary>

If there another note with the same title said Note already exists

</details>

3. Create a function if they enter 2 that reads a file that user input and read the info and prints it like this
```
Enter the name of the note to read: 
test
Day 8
```

<details> <summary>💡 Hint </summary>

print Note does not exist if you can find the file

</details>

4. Create a function if they enter 3 that ask for the note they are append to and ask what they want to append like this

```
Enter the name of the note to append to: 
test
Enter the content to append: 
Day 9
Added
```

5. Create a function if they enter 4 that ask what they want to delete and delete it like this

```
Enter the name of the note to delete: 
test
Deleted: test.txt
```