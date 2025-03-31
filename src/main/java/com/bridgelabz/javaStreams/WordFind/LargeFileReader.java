package com.bridgelabz.javaStreams.WordFind;
import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-streams/src/main/java/com/bridgelabz/javaStreams/WordFind/largeFile.txt";
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read file line by line
            while ((line = br.readLine()) != null) {
                // Case-insensitive check for "error"
                if (line.toLowerCase().contains("error")) {
                    // Print only lines containing "error"
                    System.out.println(line);
                    found = true;
                }
            }

            // If no "error" word found, print a message
            if (!found) {
                System.out.println("Word \"error\" not found in the file.");
            }
        } catch (IOException e) {
            // Handle file read exceptions
            System.out.println("Error: " + e.getMessage());
        }
    }
}
