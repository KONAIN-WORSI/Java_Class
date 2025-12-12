package Week_4;

import java.util.Scanner;
/**
 * This program converts GPA into a specific grade.
 *
 * @author Konain Worsi
 * @version 28.11
 */
public class GpaGradeConversion
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your GPA: ");
        double gpa = input.nextDouble();
        
        if (gpa >= 3.6 && gpa <= 4.0) {
            System.out.println("Congratulation! you got A grade");
        }else if (gpa >= 2.8 && gpa <= 3.5) {
            System.out.println("Congratulation! you got B grade");
        }else if (gpa >= 1.6 && gpa <= 2.7) {
            System.out.println("Congratulation! you got C grade");
        }else {
            System.out.println("Invalid GPA Input!");
        }
    }
}