package Week_4;

import java.util.Scanner;
/**
 * Write a description of class IncomeTaxCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IncomeTaxCalculator
{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your total annual income: ");
        double income = input.nextDouble();
        
        double tax = 0;
        

        if (income <= 500000) {
            tax = income * 0.01;
        } else if (income <= 700000) {
            tax = 500000 * 0.01 + (income - 500000) * 0.1;
        } else if (income <= 1000000) {
            tax = 500000 * 0.01 + 200000 * 0.1 + (income - 700000) * 0.2;
        } else if (income <= 2000000) {
            tax = 500000 * 0.01 + 200000 * 0.1 + 300000 * 0.2 + (income - 1000000) * 0.3;
        } else if (income <= 5000000) {
            tax = 500000 * 0.01 + 200000 * 0.1 + 300000 * 0.2 + 1000000 * 0.3 + (income - 2000000) * 0.36;
        } else {
            tax = 500000 * 0.01 + 200000 * 0.1 + 300000 * 0.2 + 1000000 * 0.3 + 3000000 * 0.36 + (income - 5000000) * 0.39;
        }
        
        System.out.println("The total payable tax amount is: " + tax);
        System.out.println("Net Income after tax: " + (income - tax) );
            
            
    }
}