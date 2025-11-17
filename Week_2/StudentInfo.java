package Week_2;

import java.util.Scanner;
/**
 * Write a description of class Week2Workshop here.
 *
 * @author Konain Worsi
 * @version 11.14.25
 */
public class StudentInfo
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your following information: ");
        
        var studentName = input.nextLine();
        var age = input.nextInt();
        var gpa = input.nextDouble();
        
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + age);
        System.out.println("Student GPA: " + gpa);
    }
}