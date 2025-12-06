package Workshop;

import java.util.Scanner;
/**
 * Write a description of class RikshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RikshawFare
{   static final int BASE_FARE_COST = 20;
    static final int NIGHT_FARE_COST = 20;
    static final int PER_MINUTE_COST = 2;
    static final double LOCAL_RESIDENCE_DISCOUNT = 0.10;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your residence (true/false): ");
        boolean residence = input.nextBoolean();
        
        System.out.println("Enter the distance traveled(in KM): ");
        double distance = input.nextDouble();
        
        System.out.println("Enter the time to travel the  distance(in Minute): ");
        int time = input.nextInt();
        
        System.out.println("Is the fare night time travel ?");
        boolean night = input.nextBoolean();
        
        double totalFare = BASE_FARE_COST + (PER_MINUTE_COST * distance) + (PER_MINUTE_COST * time);
        
        double nightFare = BASE_FARE_COST + (PER_MINUTE_COST * distance) + (PER_MINUTE_COST * time) + NIGHT_FARE_COST;
        
        double nightConditionFare = (night) ? nightFare:totalFare;
        
        double localFare = (residence) ? totalFare - LOCAL_RESIDENCE_DISCOUNT * totalFare: totalFare;
        double nightLocalFare = (night && residence) ? nightFare - LOCAL_RESIDENCE_DISCOUNT * nightFare: nightFare;
        
        
        if (night) {
            System.out.println("Your total night fare: " + nightFare);
        }else if (residence) {
            System.out.println("Local residence fare: " + localFare);
        }else if (residence && night) {
            System.out.println("Night local residence fare: " + nightLocalFare);
        }else {
            System.out.println("Your total fare: " + totalFare);
        }
        
        System.out.println("Thanks for using our ride!");
        
        
        
        
        
        
        
        
        
        
        
        
    }
}