package JavaProject;
import java.util.Scanner;

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
                    try {
                        user.withdraw(4800);
                    } catch (MinimumBalanceExcept e) {
                        System.out.println("Exception: " + e.getMessage());
                    }

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
