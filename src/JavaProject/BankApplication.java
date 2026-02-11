package com.bank;

import java.util.Scanner;

class User {
    private String username;
    private String name;
    private String email;
    private String password;
    private double balance;

    public User(String username, String name, String email, String password, double balance) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    // Login validation
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
            System.out.println("Updated Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Updated Balance: ₹" + balance);
        }
    }


    // Check Balance
    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    // Edit Profile
    public void editProfile(String newName, String newEmail) {
        this.name = newName;
        this.email = newEmail;
        System.out.println("Profile updated successfully.");
    }

    // Change Password
    public void changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Incorrect old password.");
        }
    }

    public void showProfile() {
        System.out.println("Username: " + username);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

public class BankApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Default user account
        User user = new User("john123", "John Doe", "john@gmail.com", "1234", 5000);

        System.out.println("==== Welcome to Bank System ====");

        // 🔐 Login Section
        System.out.print("Enter Username: ");
        String inputUsername = sc.nextLine();

        System.out.print("Enter Password: ");
        String inputPassword = sc.nextLine();

        if (!user.login(inputUsername, inputPassword)) {
            System.out.println("Invalid Username or Password. Exiting...");
            sc.close();
            return;
        }

        System.out.println("Login Successful! ✅");

        int choice;

        do {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Edit Profile");
            System.out.println("5. Change Password");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    user.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    user.withdraw(withdrawAmount);
                    break;

                case 3:
                    user.checkBalance();
                    break;

                case 4:
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = sc.nextLine();
                    user.editProfile(newName, newEmail);
                    break;

                case 5:
                    System.out.print("Enter old password: ");
                    String oldPass = sc.nextLine();
                    System.out.print("Enter new password: ");
                    String newPass = sc.nextLine();
                    user.changePassword(oldPass, newPass);
                    break;

                case 6:
                    System.out.println("Thank you for using our bank system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
