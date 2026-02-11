package com.ExceptionHandling.sample;
import java.util.Scanner;

public class Example {
    public static class InvalidCardNumberException extends Exception {
        public InvalidCardNumberException(String message) {
            super(message);
        }
    }
    public static void validateCardNumber(String cardNumber) throws InvalidCardNumberException {
        if (cardNumber == null) {
            throw new InvalidCardNumberException("Card number is null");
        }

        // Remove spaces if user provides grouped digits like "1234 5678 9012 3456"
        String normalized = cardNumber.replaceAll("\\s+", "");

        if (normalized.length() < 16) {
            throw new InvalidCardNumberException("Invalid card number: fewer than 16 digits");
        }

        if (normalized.length() != 16) {
            throw new InvalidCardNumberException("Invalid card number: must be exactly 16 digits");
        }

        if (!normalized.matches("\\d{16}")) {
            throw new InvalidCardNumberException("Invalid card number: contains non-digit characters");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter credit card number: ");
            String input = scanner.nextLine();

            try {
                validateCardNumber(input);
                System.out.println("Accepted: valid 16-digit card number.");
            } catch (InvalidCardNumberException e) {
                System.out.println("Rejected: " + e.getMessage());
            }
        }
    }
}