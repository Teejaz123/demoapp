package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * A simple Maven test application.
 * Demonstrates:
 *  - Basic console input/output
 *  - Date/time formatting
 *  - Running a Java program built with Maven
 */
public class App {

    public static void main(String[] args) {
        printHeader();

        String userName = getUserName();
        greetUser(userName);

        printFooter();
    }

    private static void printHeader() {
        String dateTime = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("===========================================");
        System.out.println("   🚀 Maven Test Application");
        System.out.println("   📅 " + dateTime);
        System.out.println("===========================================\n");
    }

    private static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine().trim();
    }

    private static void greetUser(String name) {
        System.out.println("\nHello, " + name + "! 🎉");
        System.out.println("Your Maven project is running successfully.");
    }

    private static void printFooter() {
        System.out.println("\n===========================================");
        System.out.println(" End of Maven Test Application");
        System.out.println("===========================================");
    }
}
