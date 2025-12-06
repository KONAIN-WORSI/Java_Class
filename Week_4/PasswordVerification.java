package Week_4;

import java.util.Scanner;
/**
 * Write a description of class PasswordVerification here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PasswordVerification
{   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter password: ");
        String password = input.nextLine();
        
        System.out.println("Enter confrim password: ");
        String passwordConfirm = input.nextLine();
        
        if (password.equals(passwordConfirm)) {
            System.out.println("You password is right!");
        } else {
            System.out.println("Your password is wrong!, try again");
        }
        
        
    }
}