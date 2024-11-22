package operation;

import exception.WrongPasswordException;
import validator.PasswordValidator;

import java.util.Scanner;

public class PasswordCheckOperation {
    public static void PasswordCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password");
        String password = scanner.nextLine();
        System.out.println("Confirm password");
        String confirmPassword = scanner.nextLine();
        try{
            PasswordValidator.validatePassword(password, confirmPassword);
            System.out.println("Password verification passed");
        }catch (WrongPasswordException e) {
            System.out.println("Password verification error "  + e.getMessage());
        }
    }
}
