package week_6;

import java.util.Scanner;
/**
 * Write a description of class StudentArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentArray
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] studentNames = {"Asha", "Ramesh", "Sita", "Binod", "Sabita"};
        
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i]);
        }
        
        System.out.println(studentNames[2]);
        
        studentNames[4] = "Babita";
        System.out.println(studentNames[4]);
        
        
        for (int i = 0; i < studentNames.length; i++ ) {
            System.out.println("Enter the " + i + " index of the array to store the names");
            studentNames[i] = input.nextLine();
        }
        
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i]);
        }
        
        
    }
}