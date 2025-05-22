package login;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        boolean running = true;

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Register\n2. Login\n3. Forgot Password\n4. Exit");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter username: ");
                    String regUsername = scanner.nextLine();

                    System.out.print("Enter password: ");
                    String regPassword = scanner.nextLine();

                    System.out.print("Enter SA cell number (e.g. +27831112222): ");
                    String regCell = scanner.nextLine();

                    String registrationResult = login.registerUser(regUsername, regPassword, regCell);
                    System.out.println(registrationResult);
                    break;

                case "2":
                    System.out.print("Enter username: ");
                    String logUsername = scanner.nextLine();

                    System.out.print("Enter password: ");
                    String logPassword = scanner.nextLine();

                    boolean loginSuccess = login.loginUser(logUsername, logPassword);
                    System.out.println(login.returnLoginStatus(loginSuccess));
                    break;

                case "3":
                    System.out.println("Feature not yet implemented.");
                    break;

                case "4":
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}