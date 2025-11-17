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
        
        var num1 = input.nextInt();
        var num2 = input.nextInt();
        
        var add = num1 + num2;
        var subtract = num1 - num2;
        var multiple = num1 * num2;
        double division = num1 / num2;
        
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + subtract);
        System.out.println("Multiplication: " + multiple);
        System.out.println("Division: " + division);
    }
}