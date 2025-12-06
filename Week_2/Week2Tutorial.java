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
        
        
        var math = 50;
        var science = 30;
        var programming = 80;
        
        var totalMarks = math + science + programming;
        var totalPercentage = (totalMarks / 300.00) * 100;
        var result = (math >= 40 && science >= 40 && programming >= 40) ? "Pass" : "Fail";
        
        //  var fname = "Konain";
        //  var lname = "Worsi";
        
        System.out.println("Enter your first name");
        var fname = input.nextLine();
        
        System.out.println("Enter your last name");
        var lname = input.nextLine();
        
        
        var name = fname + " " + lname;
        
        
        System.out.println(" \'Hello', " + name);
        System.out.println("You are: " + result);
        System.out.println("You have got this percentage " + totalPercentage + "%");
        System.out.println(" Date: \"2082\\07\\28\"   ");
        
        
    }
}