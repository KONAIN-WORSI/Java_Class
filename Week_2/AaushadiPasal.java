package Week_2;

import java.util.Scanner;
/**
 * Write a description of class AaushadiPasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AaushadiPasal
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter medicine name: ");
        String medicineName = input.nextLine();
        
        System.out.println("Enter the price of medicine: ");
        int medicinePrice = input.nextInt();
        
        System.out.println("Enter the quantity of the medicine: ");
        int medicineQuantity = input.nextInt();
        
        int total = medicinePrice * medicineQuantity;
        
        System.out.println("=================================");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Name","Price", "Quantity", "Total");
        System.out.printf("%-20s %6s %6s %10s\n",medicineName,medicinePrice, + medicineQuantity, + total);
         System.out.println("=================================");
        
        
        
        
    }
}