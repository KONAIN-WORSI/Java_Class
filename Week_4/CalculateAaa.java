package Week_4;

import java.util.Scanner;
/**
 * This program calculate the AAA scholarship of students
 *
 * @author konain worsi
 * @version 26.11
 */
public class CalculateAaa
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your marks: ");
        int marks = input.nextInt();
        
        System.out.println("Enter your attendance score: ");
        int attendanceScore = input.nextInt();
        
        System.out.println("Enter your attitude score: ");
        double attitudeSocre = input.nextDouble();
        
        if (marks >= 80) {
            if (attendanceScore >= 70) {
                if (attitudeSocre >= 7.5) {
                    System.out.println("Congratulations ! for the AAA scholarship");
                }
            }
        } else{
            System.out.println("Your marks doesn't meet the AAA scholarship criteria");
        }
    }
}