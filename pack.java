
package com.example.myapp;
import java.util.Scanner;
public class pack {
    // Main method
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        greetings.Greeter greeter = new greetings.Greeter();
        System.out.println(greeting);
        scanner.close();
    }
}
