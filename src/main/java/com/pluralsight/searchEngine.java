package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class searchEngine {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("logs.txt", true))){
          boolean isexit = false;
          bufferedWriter.write(dateAndTime() + " launch" + "\n");
          while (!isexit) {
              Scanner input = new Scanner(System.in);
              System.out.print("Enter a search term (X or x to exit): ");
              String userInput = input.nextLine();
              if (!userInput.equalsIgnoreCase("x")) {
                  bufferedWriter.write(dateAndTime() + " " + "search : " + userInput + "\n");
              } else {
                  bufferedWriter.write(dateAndTime() + " Exit");
                  isexit = true;

                  return;
              }

          }

        } catch (Exception e) {
            System.out.println("something is wrong :( ");
        }
        dateAndTime();
        System.out.println(dateAndTime());
    }



    public static String dateAndTime (){
        LocalDateTime DTnow = LocalDateTime.now();
        DateTimeFormatter formated = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
        String formattedDateTime = formated.format(DTnow);

        return (formattedDateTime);
    }
}
