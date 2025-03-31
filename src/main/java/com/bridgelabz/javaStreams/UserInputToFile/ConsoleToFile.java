package com.bridgelabz.javaStreams.UserInputToFile;
import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) {
        // Define the output file
        String filename = "C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-streams/src/main/java/com/bridgelabz/javaStreams/UserInputToFile/ConsoleOutput.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(filename, true)) { // Append mode

            // Read user input
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Write data to file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");
            writer.write("---------------------------\n");

            System.out.println("User information saved successfully in " + filename);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

/*
Enter your name: Sehaj
Enter your age: 22
Enter your favorite programming language: Java
User information saved successfully in /Users/sanyakhanna/Desktop/bridgelabz-workspace/Java-Streams/src/main/java/com/bridgelabz/javaStreams/userInputToFile/consoleOutputFile.txt

 */
