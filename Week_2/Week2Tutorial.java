package Week_2;

import java.util.Scanner; // import Scanner class to take input from the user

/**
 * Write a description of class Week2Tutorial here.
 *
 * @author (Konain Worsi)
 * @version (2025.11.12)
 */
public class Week2Tutorial
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int math = 50;
        int science = 30;
        int programming = 80;
        
        int totalMarks = math + science + programming;
        double totalPercentage = (totalMarks / 300.00) * 100;
        String result = (math >= 40 && science >= 40 && programming >= 40) ? "Pass" : "Fail";
        
        //  var fname = "Konain";
        //  var lname = "Worsi";
        
        System.out.println("Enter your first name");
        String fname = input.nextLine();
        
        System.out.println("Enter your last name");
        String lname = input.nextLine();
        
        
        String name = fname + " " + lname;
        
        
        System.out.println(" \'Hello', " + name);
        System.out.println("You are: " + result);
        System.out.println("You have got this percentage " + totalPercentage + "%");
        System.out.println(" Date: \"2082\\07\\28\"   ");
        
        
    }
}