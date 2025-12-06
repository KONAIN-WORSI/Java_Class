package Week_4;

import java.util.Scanner;
/**
 * Write a description of class PositiveNumberChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PositiveNumberChecker
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your number: ");
        int number = input.nextInt();
        
        if (number < 0) {
            System.out.println(number + "is a negative number.");
        }else {
            System.out.println(number + "is a positive number.");
        }
    }
}