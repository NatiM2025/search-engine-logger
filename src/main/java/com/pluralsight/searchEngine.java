package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class searchEngine {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("logs.txt", true))){
            Scanner input = new Scanner(System.in);
            System.out.println("a. Launching the application\n" +
                    "b. Searching for a term\n" +
                    "c. Exiting the application");
            System.out.print("Enter a search term (X or x to exit): ");
            String userInput = input.nextLine();
            bufferedWriter.write(userInput);

        } catch (Exception e) {
            System.out.println("something is wrong :( ");
        }
        LocalDateTime DTnow = LocalDateTime.now();
        System.out.println(DTnow);

    }
}
