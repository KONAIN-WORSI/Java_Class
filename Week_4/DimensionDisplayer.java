package Week_4;

import java.util.Scanner;
/**
 * Write a description of class DimensionDisplayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DimensionDisplayer
{
    static final String A0_PAPER_SIZE_MM_INCH = "841 X 1189 mm (33.1 X 46.8 inches)";
    static final String A1_PAPER_SIZE_MM_INCH = "594 X 841 mm (23.4 X 33.1 inches)";
    static final String A2_PAPER_SIZE_MM_INCH = "420 X 594 mm (16.5 X 23.4 inches)";
    static final String A3_PAPER_SIZE_MM_INCH = "297 X 420 mm (11.7 X 16.5 inches)";
    static final String A4_PAPER_SIZE_MM_INCH = "210 X 297 mm (8.3 X 11.7 inches)";
    static final String A5_PAPER_SIZE_MM_INCH = "148 X 210 mm (5.8 X 8.3 inches)";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the paper size (A0, A1, A2, A3, A4, A5): ");
        String paperSize = input.nextLine();
        
        switch (paperSize) {
            case "A0":
                System.out.println("The paper size of A0 in MM and INCH dimension is " + A0_PAPER_SIZE_MM_INCH);
                break;
            case "A1":
                System.out.println("The paper size of A1 in MM and INCH dimension is " + A1_PAPER_SIZE_MM_INCH);
                break;
            case "A2":
                System.out.println("The paper size of A2 in MM and INCH dimension is " + A2_PAPER_SIZE_MM_INCH);
                break;
            case "A3":
                System.out.println("The paper size of A3 in MM and INCH dimension is " + A3_PAPER_SIZE_MM_INCH);
                break;
            case "A4":
                System.out.println("The paper size of A4 in MM and INCH dimension is " + A4_PAPER_SIZE_MM_INCH);
                break;
            case "A5":
                System.out.println("The paper size of A5 in MM and INCH dimension is " + A5_PAPER_SIZE_MM_INCH);
                break;
            default :
                System.out.println("Invalid Input!. Please enter paper size (A0, A1, A2, A3, A4, A5)");
        }
    }
}