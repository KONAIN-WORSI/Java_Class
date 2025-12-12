package Week_5;

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
        while (true) {
            System.out.println("Enter your first number: ");
            double num1 = input.nextDouble();

            System.out.println("Enter your second number: ");
            double num2 = input.nextDouble();

            System.out.println("Enter an operator (+, -, *, /): ");
            String operator =  input.next();

            double output = 0;

            switch (operator) {
                case "+":
                    output = num1 + num2;
                    break;
                case "-":
                    output = num1 - num2;
                    break;
                case "*":
                    output = num1 * num2;
                    break;
                case "/":
                    output = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator!");

            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + output);

            System.out.println("Do you want to continue? (yes/no): ");
            String response =  input.next();


            switch(response.toLowerCase()) {
                case "yes" :
                    continue;
                case "no":
                    break;
                default:
                    System.out.println("Invalid response! Exiting the calculator.");  
            }

            break;

        }

        System.out.println("Thank you for using the calculator. Goodbye!"); 
        
    
    }
}