package Week_4;

import java.util.Scanner;
/**
 * Write a description of class CinemaTicketChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CinemaTicketChecker
{
    static final int MOVIE_TICKET_PRICE_CHILD = 150;
    static final int MOVIE_TICKET_PRICE_ADULT = 250;
    static final int MOVIE_TICKET_PRICE_SENIOR = 200;
    static final double MOVIE_TICKET_PRICE_DISCOUNT_STUDENT = 0.2;
    static final double MOVIE_TICKET_PRICE_DISCOUNT_FESTIVAL = 0.15;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==============================================");
        System.out.println("            Welcome to QFX Cinema!            ");
        System.out.println("==============================================");
        
        
        System.out.println("Enter your age group: ");
        System.out.println("1. Child ");
        System.out.println("2. Adult ");
        System.out.println("3. Senior ");
        int ageGroup = input.nextInt();
        
        System.out.println("Choose the movie language: ");
        System.out.println("1. Nepali ");
        System.out.println("2. Hindi ");
        System.out.println("3. English ");
        int movieLanguage =  input.nextInt();
        
        System.out.println("Enter your occupation:  ");
        System.out.println("1. Student ");
        System.out.println("2. Working Professional ");
        System.out.println("3. Business Owner  ");
        int occupation = input.nextInt();
        
        System.out.println("Is there a festive occassion ");
        boolean festive = input.nextBoolean();
        
        double moviePrice = 0;
        
        if (ageGroup == 1) {
            moviePrice = MOVIE_TICKET_PRICE_CHILD;
        }else if (ageGroup == 2) {
            moviePrice = MOVIE_TICKET_PRICE_ADULT;
        }else if (ageGroup == 3) {
            moviePrice = MOVIE_TICKET_PRICE_SENIOR;
        }else {
            System.out.println("Please enter the given numbers (1, 2, 3)");
        }
        
        if (movieLanguage == 1) {
            moviePrice = moviePrice;
        }else if(movieLanguage == 2) {
            moviePrice += 50;
        }else if(movieLanguage == 3) {
            moviePrice += 100;
        }else {
            System.out.println("Please select the movie language (1, 2, 3)");
        }
        
        if (occupation == 1) {
            moviePrice = moviePrice - (moviePrice * MOVIE_TICKET_PRICE_DISCOUNT_STUDENT);
        }
        
        if (festive) {
            moviePrice = moviePrice - (moviePrice * MOVIE_TICKET_PRICE_DISCOUNT_FESTIVAL);
        }
        
        System.out.println("Your total price for the movie is: " + moviePrice);
        
    }
}