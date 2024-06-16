package org.ermix.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting the app...");

        System.out.println("1.Gestion Basique des Exceptions ");
        int number1 = 100;
        try (Scanner scanner1 = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int number2 = scanner1.nextInt();
            int result = number1 / number2;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        System.out.println("2.Conversion de chaîne en nombre ");
        try (Scanner scanner2 = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            String number = scanner2.nextLine();
            int result = Integer.parseInt(number);
            System.out.println("The result is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        System.out.println("3.Manipulation de tableaux ");
        try (Scanner scanner3 = new Scanner(System.in)) {
            System.out.println("Enter length: ");
            int length = scanner3.nextInt();
            int[] numbers = new int[length];

            for (int i = 0; i < length; i++) {
                System.out.println("Enter the element T["+(++i)+"]: ");
                numbers[i] = scanner3.nextInt();
            }

            System.out.println("The numbers are: ");
            for (int number : numbers) {
                System.out.println("T["+(++number)+"]: " + number);
            }
        } catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}