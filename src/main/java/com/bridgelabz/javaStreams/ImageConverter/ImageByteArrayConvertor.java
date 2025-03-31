package com.bridgelabz.javaStreams.ImageConverter;
import java.io.*;

public class ImageByteArrayConvertor {
    public static void main(String[] args) {
        // Original image file
        String inputImagePath = "C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-streams/src/main/java/com/bridgelabz/javaStreams/ImageConverter/input.jpg";

        // Image file after conversion
        String outputImagePath = "C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-streams/src/main/java/com/bridgelabz/javaStreams/ImageConverter/output.jpg";

        try {
            // Convert Image to Byte Array
            byte[] imageData = convertImageToByteArray(inputImagePath);

            // Convert Byte Array back to Image
            writeByteArrayToImage(imageData, outputImagePath);

            System.out.println("Image successfully converted to byte array and written back.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Method to convert image file to byte array
    public static byte[] convertImageToByteArray(String filePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(filePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            // Read in chunks of 4KB
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    // Method to write byte array back to an image file
    public static void writeByteArrayToImage(byte[] imageData, String filePath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
             FileOutputStream fos = new FileOutputStream(filePath)) {

            // Write in chunks of 4KB
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}


/*
O/P->
Image successfully converted to byte array and written back.
 */