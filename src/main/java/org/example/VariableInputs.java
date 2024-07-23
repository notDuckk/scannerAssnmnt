package org.example;

import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string of text:");
        String text = input.nextLine();

        System.out.println("Enter an integer:");
        int number = input.nextInt();

        System.out.println("Enter a double:");
        double number2 = input.nextDouble();

        System.out.println("Enter a boolean value:");
        boolean bool = input.nextBoolean();

        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + number);
        System.out.println("Your double is " + number2);
        System.out.println("Your bool is " + bool);
    }
}
