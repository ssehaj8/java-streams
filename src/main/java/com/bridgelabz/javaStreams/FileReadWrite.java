package com.bridgelabz.javaStreams;
import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        // Source file name
        String sourceFile = "C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-streams/src/main/java/com/bridgelabz/javaStreams/input.txt";

        // Destination file name
        String destinationFile = "C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-streams/src/main/java/com/bridgelabz/javaStreams/FileReadWriteOutput.txt";

        // Check if the source file exists
        File inputFile = new File(sourceFile);
        if (!inputFile.exists()) {
            System.out.println("Error: Source file '" + sourceFile + "' does not exist.");
            return;
        }

        // Read from input.txt and write to output.txt
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully to '" + destinationFile + "'.");

        } catch (IOException e) {
            System.out.println("An error occurred while processing the file: " + e.getMessage());
        }
    }
}


/*
O/P->
File copied successfully to 'C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-streams/src/main/java/com/bridgelabz/javaStreams/FileReadWriteOutput.txt'.
 */
