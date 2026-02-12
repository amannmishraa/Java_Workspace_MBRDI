package JavaProject;

public class User {

    private String username;
    private String name;
    private String email;
    private String password;
    private double balance;

    private static final double MIN_BALANCE = 500;

    public User(String username, String name, String email, String password, double balance) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
            System.out.println("Updated Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // 🔥 Updated Withdraw Method with Custom Exception
    public void withdraw(double amount) throws MinimumBalanceExcept {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        }
        else if ((balance - amount) < MIN_BALANCE) {
            throw new MinimumBalanceExcept(
                    "Cannot withdraw. Minimum balance of ₹500 must be maintained.");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Updated Balance: ₹" + balance);
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void editProfile(String newName, String newEmail) {
        this.name = newName;
        this.email = newEmail;
        System.out.println("Profile updated successfully.");
    }

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

