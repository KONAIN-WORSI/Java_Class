package Workshop;

import java.util.Scanner;
/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your grade: ");
        int grade = input.nextInt();
        
        String result = (grade >=  40) ? "Pass":"Fail";
        
        System.out.println("You are " + result + " according to your garde evaluation!");
    }
}