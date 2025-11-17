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
        
        var medicineName = input.nextLine();
        var medicinePrice = input.nextInt();
        var medicineQuantity = input.nextInt();
        var total = medicinePrice * medicineQuantity;
        
        System.out.println("=================================");
        System.out.printf("%-40s %-10s %-10s\n", "Name","Price", "Quantity");
        System.out.printf("%-40s %10s %6s\n",medicineName,medicinePrice, + medicineQuantity);
        System.out.println("=================================");
        
        
        
        
    }
}