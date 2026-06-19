import java.util.ArrayList;
import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userId = "PRN250607";
        String pin = "1234";

        double balance = 10000.0;

        ArrayList<String> history = new ArrayList<>();

        System.out.println("===== ATM INTERFACE =====");

        System.out.print("Enter User ID: ");
        String enteredUser = sc.nextLine();

        System.out.print("Enter PIN: ");
        String enteredPin = sc.nextLine();

        if (!enteredUser.equals(userId) || !enteredPin.equals(pin)) {
            System.out.println("Invalid User ID or PIN!");
            return;
        }

        System.out.println("\nLogin Successful!");

        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Check Balance");
            System.out.println("6. Quit");

            System.out.print("Choose Option: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\nTransaction History");

                    if (history.isEmpty()) {
                        System.out.println("No Transactions Yet.");
                    } else {
                        for (String h : history) {
                            System.out.println(h);
                        }
                    }
                    break;

                case 2:

                    System.out.print("Enter Amount to Withdraw: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        history.add("Withdraw: Rs." + withdraw);
                        System.out.println("Withdrawal Successful!");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 3:

                    System.out.print("Enter Amount to Deposit: ");
                    double deposit = sc.nextDouble();

                    balance += deposit;
                    history.add("Deposit: Rs." + deposit);

                    System.out.println("Deposit Successful!");
                    break;

                case 4:

                    System.out.print("Enter Receiver Account Number: ");
                    String account = sc.next();

                    System.out.print("Enter Amount to Transfer: ");
                    double transfer = sc.nextDouble();

                    if (transfer <= balance) {

                        balance -= transfer;

                        history.add("Transfer Rs." + transfer
                                + " to Account " + account);

                        System.out.println("Transfer Successful!");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 5:

                    System.out.println("Current Balance: Rs." + balance);
                    break;

                case 6:

                    System.out.println("Thank You for Using ATM!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}

