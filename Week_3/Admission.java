package Week_3;

import java.util.Scanner;
/**
 * This program hanldes admission related operations.
 *
 * @author Konain Worsi
 * @version 19.11
 */
public class Admission
{
    static final double MAX_DISCOUNT_PERCENT = 0.20;
    static final double MIN_DISCOUNT_PERCENT = 0.10;
    static final double DISCOUNT_CRITERIA = 3.6;
    
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your first name: ");
        String fname = input.nextLine();
        
        System.out.println("Enter your last name: ");
        String lname = input.nextLine();
        
        System.out.println("Enter your address: ");
        String address = input.nextLine();
        
        System.out.println("Enter your admission fee: ");
        double admissionFee = input.nextDouble();
        
        System.out.println("Enter your GPA: ");
        float gpa = input.nextFloat();
        
        System.out.println("Enter your grade (A/B/C/D): ");
        String grade = input.next();
        
        
        boolean discountStatus = (gpa >= DISCOUNT_CRITERIA) ? true:false;
        
        
        System.out.println("Details");
        System.out.println("Full name: " + fname +" "+ lname);
        System.out.println("Gpa: " + gpa);
        System.out.println("Grade: " + grade);
        System.out.println("Admission Fee: " +admissionFee);
        System.out.println("Eligible for discount: " + discountStatus);
        
        double discountAmount = (discountStatus == true) ? MAX_DISCOUNT_PERCENT * admissionFee: MIN_DISCOUNT_PERCENT * admissionFee;
        
        double afterDisountFee = admissionFee - discountAmount;
        
        System.out.println("Total amount of Admission fee after discount: " + afterDisountFee);
        
        
    }
}