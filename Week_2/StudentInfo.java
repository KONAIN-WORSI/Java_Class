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
        
        System.out.println("Enter your following information: ");
        System.out.println("Enter your name: ");
        var studentName = input.nextLine();
        
        System.out.println("Enter your age: ");
        var age = input.nextInt();
        
        System.out.println("Enter your GPA: ");
        var gpa = input.nextDouble();
        
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + age);
        System.out.println("Student GPA: " + gpa);
    }
}