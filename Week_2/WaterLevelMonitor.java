package Week_2;

import java.util.Scanner;
/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor

{

    static final int water_warning = 1000;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Water level: ");
        
        var waterLevel = input.nextInt();
        
        System.out.println("The current Water level is: " + waterLevel);
        
        var waterLevelMonitor = (waterLevel >= water_warning) ? "Warning: Water level has reached 1000L or more!" : "Status: Normal";
        
        System.out.println("Status of your water tank: " + waterLevelMonitor);
        
        
        
    }
}