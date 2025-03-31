package com.bridgelabz.javaStreams.caseSensitivity;
import java.io.*;

public class UppercaseToLowercase {
    public static void main(String[] args) {
        String inputFile = "C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-streams/src/main/java/com/bridgelabz/javaStreams/caseSensitivity/caseConvertOutput.txt";
        String outputFile = "C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-streams/src/main/java/com/bridgelabz/javaStreams/caseSensitivity/caseConvertOutput.txt";

        try {
            convertUppercaseToLowercase(inputFile, outputFile);
            System.out.println("Uppercase in input file successfully converted to lowercase.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Method to read a file and write its contents in lowercase
    public static void convertUppercaseToLowercase(String inputFile, String outputFile) throws IOException {
        try (BufferedReader read = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = read.readLine()) != null) {
                // Convert to lowercase and write to output file
                writer.write(line.toLowerCase());
                writer.newLine();
            }
        }
    }
}

/*
O/P->
Uppercase in input file successfully converted to lowercase.
 */