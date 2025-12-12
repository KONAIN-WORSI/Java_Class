package Week_4;

import java.util.Scanner;
/**
 * Write a description of class SellingPriceCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SellingPriceCalculator
{   
    static final double CATEGORY_A_DISCOUNT_PERCENT = 0.6;
    static final double CATEGORY_B_DISCOUNT_PERCENT = 0.4;
    static final double CATEGORY_C_DISCOUNT_PERCENT = 0.2;
    static final double CATEGORY_D_DISCOUNT_PERCENT = 0.1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Marked Price: ");
        double markedPrice = input.nextDouble();

        System.out.println("Enter your discount category (A/B/C/D) Price: ");
        char category = input.next().toUpperCase().charAt(0);
        
        double totalAmount =0;
        double discount = 0;

        switch (category) {
            case 'A':
                discount =markedPrice * CATEGORY_A_DISCOUNT_PERCENT;
                totalAmount = markedPrice - discount;
                break;
            case 'B':
                discount = markedPrice * CATEGORY_B_DISCOUNT_PERCENT;
                totalAmount = markedPrice - discount;
                break;
            case 'C':
                discount = markedPrice * CATEGORY_C_DISCOUNT_PERCENT;
                totalAmount = markedPrice - discount;
                break;
            case 'D':
                discount = markedPrice * CATEGORY_D_DISCOUNT_PERCENT;
                totalAmount = markedPrice - discount;
                break;
            default:
                System.out.println("Invalid Input!. Please enter the Specific mentioned category"); 
        }
        System.out.println("Total selling price is " + totalAmount);

    }
}