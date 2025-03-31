package com.bridgelabz.javaStreams.StudentDetails;
import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        String fileName = "C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-streams/src/main/java/com/bridgelabz/javaStreams/StudentDetails/student_data.bin";

        // Store student details in a binary file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            // Roll Number
            dos.writeInt(1830);
            // Name
            dos.writeUTF("Sehaj");
            // GPA
            dos.writeDouble(4.35);

            dos.writeInt(1832);
            dos.writeUTF("Sehajpreet Kaur");
            dos.writeDouble(3.87);

            System.out.println("Student data written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing data: " + e.getMessage());
        }

        // Retrieve student details from the binary file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.err.println("Error reading data: " + e.getMessage());
        }
    }
}
