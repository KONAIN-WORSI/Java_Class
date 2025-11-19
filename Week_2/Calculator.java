package Week_2;

import java.util.Scanner;
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your expressions: ");
        System.out.println("Enter your first number: ");
        double num1 = input.nextInt();
        
        System.out.println("Enter your next number: ");
        double num2 = input.nextInt();
        
        double add = num1 + num2;
        double subtract = num1 - num2;
        double multiple = num1 * num2;
        double division = num1 / num2;
        
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + subtract);
        System.out.println("Multiplication: " + multiple);
        System.out.println("Division: " + division);
    }
}