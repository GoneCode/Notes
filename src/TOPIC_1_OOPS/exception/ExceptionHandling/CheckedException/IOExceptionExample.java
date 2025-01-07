package TOPIC_1.exception.ExceptionHandling.CheckedException;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {

        // TODO : Description: Occurs when there is an input-output operation failure, such as reading from a file that does not exist.

        try {
            FileReader file = new FileReader("nonexistentfile.txt");
            BufferedReader fileInput = new BufferedReader(file);
            System.out.println(fileInput.readLine());
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
