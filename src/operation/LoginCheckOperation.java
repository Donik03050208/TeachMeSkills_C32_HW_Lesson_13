package operation;

import exception.WrongLoginException;
import validator.LoginValidator;

import java.util.Scanner;

public class LoginCheckOperation {
    public static void LoginCheck() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Login");
        String login = scanner.nextLine();


        try {
            LoginValidator.validateLogin(login);

            System.out.println("Login verification passed");
        } catch (WrongLoginException e) {
            System.out.println("Login verification error " + e.getMessage());
        }
    }
}


