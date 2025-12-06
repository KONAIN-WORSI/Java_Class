package Week_4;

import java.util.Scanner;
/**
 * Write a description of class OddEvenChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OddEvenChecker
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = input.nextInt();

        if (number > 0 ) {
            if (number % 2 == 0) {
                System.out.println(number + " is Even!");
            }else {
                System.out.println(number + " is Odd!");
            }
        }else {
            System.out.println("Invalid Input, Enter greater than 0.");
        }

    }
}