package JavaProject;
public class User {

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

