package Week_4;

import java.util.Scanner;
/**
 * Write a description of class Week here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoutineGenerator
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the day (1-7): ");
        int day = input.nextInt();
        
        switch(day) {
            case 1:
                System.out.println("Today is Sunday!");
                break;
            case 2:
                System.out.println("Today is Monday!");
                break;
            case 3:
                System.out.println("Today is Tuesday!");
                break;
            case 4:
                System.out.println("Today is Wednesday!");
                break;
            case 5:
                System.out.println("Today is Thursday!");
                break;
            case 6:
                System.out.println("Today is Friday!");
                break;
            case 7:
                System.out.println("Today is Saturday!");
                break;
            default:
                System.out.println("Invalid input!");
        }
            
    }
  }
